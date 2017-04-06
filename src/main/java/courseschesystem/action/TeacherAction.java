package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Teacher;
import courseschesystem.service.impl.TeacherServiceImpl;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class TeacherAction extends SuperAction implements ModelDriven<List<Teacher>> {

    private static final long serialVersionUID = 1L;
    private List<Teacher> teachers = new ArrayList<>();
    @Override
    public List<Teacher> getModel() {
        return this.teachers;
    }

    public String teachTimeCount(){
        /**
         * @Author: Hu
         * @Description: 根据教师编号tno，统计教师本学期每星期需要上课的时长，周一到周日的时长
         *                通过 request.getParameter("tno") 获取jsp页面的 tno
         *                通过 session.setAttribute("time", times) 给jsp页面返回总时长 times数组
         * @output: return "courseTimeCount_success" if succeed or return "courseTimeCount_failure"
         * @Date: Created in 2:09 2017/4/2
         * @Modified By: zzh
         */
        String tno_String = request.getParameter("tno");   //获取教师编号tno_String,类型String
        int times[] = new int[8];
        if (tno_String!=null){
            TeacherServiceImpl teacherService = new TeacherServiceImpl();       //获取TeacherServiceImpl实例
            times = teacherService.teachTimeCount(tno_String);      //调用tCourseNumCount获取学生数量
            HttpSession session = request.getSession();
            session.setAttribute("times",times);        //向jsp页面发送times
            return "courseTimeCount_success";
        }else {
            return "courseTimeCount_failure";      //未成功获取tno_String，跳转到失败页面
        }
    }

    public String courseNumCount(){
        /**
         * @Author: zzh
         * @Description: 根据教师编号tno，统计教师本学期教授课程的总门数
         *                通过 request.getParameter("tno") 获取jsp页面的 tno
         *                通过 session.setAttribute("totalNum", totalNum) 给jsp页面返回总门数 totalNum
         * @output: return "courseNumCount_success" if succeed or return "courseNumCount_failure"
         * @Date: Created in 2:16 2017/4/2
         * @Modified By:Hu
         */
        String tno_String = request.getParameter("tno");   //获取教师编号tno_String,类型String
        if (tno_String!=null){
            TeacherServiceImpl teacherService = new TeacherServiceImpl();       //获取TeacherServiceImpl实例
            int totalNum = teacherService.tCourseNumCount(tno_String);      //调用tCourseNumCount获取学生数量
            if(totalNum >=0){                          //人数>=0
                HttpSession session = request.getSession();
                session.setAttribute("totalNum",totalNum);        //向jsp页面发送totalNum
                return "courseNumCount_success";
            }else{
                return "courseNumCount_failure";      //totalNum<0，跳转到失败页面
            }
        }else {
            return "courseNumCount_failure";      //未成功获取tno_String，跳转到失败页面
        }
    }

}
