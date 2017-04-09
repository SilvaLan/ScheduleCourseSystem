package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.dao.ArrangeDAO;
import courseschesystem.dao.impl.ArrangeDAOImpl;
import courseschesystem.entity.Activity;
import courseschesystem.entity.Arrange;
import courseschesystem.entity.Course;
import courseschesystem.service.ArrangeService;
import courseschesystem.service.CourseService;
import courseschesystem.service.impl.ArrangeServiceImpl;
import courseschesystem.service.impl.CourseServiceImpl;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:40 2017/4/6
 * @Modified By:
 */
public class ArrangeAction extends SuperAction implements ModelDriven<List<Arrange>>{

    private static final long serialVersionUID = 1L;
    private List<Arrange> arranges = new ArrayList<>();
    @Override
    public List<Arrange> getModel() {
        return this.arranges;
    }

    // 加载某天的教室使用情况
    public String queryArrangeByDate(){
        ArrangeService arrangeService = new ArrangeServiceImpl();
        HttpSession session = request.getSession();
        int week = Integer.parseInt(request.getParameter("week").toString());
        int day = Integer.parseInt(request.getParameter("day").toString());
        int cnum = Integer.parseInt(request.getParameter("cnum").toString());
        List<Arrange> arranges = arrangeService.queryArrangeByDate(week,day*10+cnum);
        session.setAttribute("arranges",arranges);
        return "queryArrangeByDate_success";
    }

    //排课动作，为某门课程排课，若无冲突，则排课成功
    public String arrangeCourse(){
        /**
         * @Author: zzh
         * @Description: 排课动作，为某门课程排课，若无冲突，则排课成功
         *                ·需要从jsp获取的数据如下：
         *                  1.课程编号 courseid 专业缩写+XXXX
         *                  2.教室号 XXX
         *                  3.排课时间，即周几，第几节课 weekday,courseNum,通过这两个参数得到课时的号码courseIndex
         *                    如周二第5节课，weekday=2，courseNum=5，可以得到课时号码为24
         * @param
         * @output:
         * @Date: Created in 9:41 2017/4/6
         * @Modified By:
         */
        ArrangeService arrangeService = new ArrangeServiceImpl();
        HttpSession session = request.getSession();

        String courseid = request.getParameter("courseid"); //课程号
        String rid = request.getParameter("rid");   //教室号
        CourseService courseService = new CourseServiceImpl();
        Course course = courseService.getCourse(courseid);
        int bweek = course.getBweek();  //起始周
        int eweek = course.getEweek();  //结束周

        int day = Integer.parseInt(request.getParameter("day"));
        int bcourse = Integer.parseInt(request.getParameter("bcourse"))-1;
        int ecourse = Integer.parseInt(request.getParameter("ecourse"))-1;

        for(int i=bweek;i<=eweek;i++){
            for(int j=bcourse;j<=ecourse;j++){
                if(!arrangeService.arrangeCourse(courseid,rid,i,day*10+j)){//调用排课方法
                    return "ArrangeCourse_failure";
                }
            }
        }

        // TODO: 2017/4/9  then update instruction table......

        return "ArrangeCourse_success";
    }

    //为临时活动排教室，若无冲突，则安排教室成功
    public String arrangeActivity(){
        ArrangeService arrangeService = new ArrangeServiceImpl();
        HttpSession session = request.getSession();

        String rid = request.getParameter("rid");
        int day = Integer.parseInt(request.getParameter("day"));

        int week = Integer.parseInt(request.getParameter("week"));  //第几周

        int bcourse = Integer.parseInt(request.getParameter("bcourse"));
        int ecourse = Integer.parseInt(request.getParameter("ecourse"));

        String acid = request.getParameter("acid");

        for(int i=bcourse;i<=ecourse;i++){
            if(!arrangeService.checkClassroomArrange(rid,week,day*10+i))
                return "ArrangeActivity_failure";
        }

        ArrangeDAO arrangeDAO = new ArrangeDAOImpl();

        //往arrange表中添加临时活动记录
        for(int i=bcourse;i<=ecourse;i++){
            Arrange arrange = new Arrange();
            arrange.setCaid(acid);
            arrange.setActype("临时活动");
            arrange.setRid(rid);
            arrange.setAcweek(week);
            arrange.setAcnum(day*10+i);
            arrangeDAO.add(arrange);
        }

        return "ArrangeActivity_success";
    }

    //加载Activity
    public String getActivity(){
        ArrangeService arrangeService = new ArrangeServiceImpl();
        HttpSession session = request.getSession();

        String acid = request.getParameter("acid");
        Activity activity = arrangeService.getActivity(acid);
        if(activity!=null){
            session.setAttribute("activity",activity);
            return "getActivity_success";
        }
        return "getActivity_failure";
    }

}
