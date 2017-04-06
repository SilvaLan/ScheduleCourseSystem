package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Schedule;
import courseschesystem.service.ScheduleService;
import courseschesystem.service.impl.ScheduleServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 18:10 2017/4/6
 * @Modified By:
 */
public class ScheduleSystem extends SuperAction implements ModelDriven{

    private static final long serialVersionUID = 1L;
    private List<Schedule> schedules = new ArrayList<>();
    private HttpServletRequest request;

    @Override
    public List<Schedule> getModel() {
        return this.schedules;
    }

    public String queryMajorSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据专业号majorid，查看本专业推荐课表，通过 request.getParameter("majorid") 获取jsp页面的majorid
         * @output: return "queryMajorSchedule_success" or "queryMajorSchedule_failure"
         * @Date: Created in 12:04 2017/4/1
         * @Modified By:Hu
         */
        String majorid_String = request.getParameter("majorid");   //获取专业号majorid_String,类型String
        if (majorid_String != null) {
            ScheduleService scheduleService = new ScheduleServiceImpl(); //获取ScheduleServiceImpl实例
            schedules = scheduleService.queryScheduleByKey("majorid",majorid_String);       //调用queryScheduleByKey获取教室信息并存储在courses中
            Schedule[][] list_list_Schedule = scheduleService.listToMatrix(schedules);         //将课程表从线性list转换为二维矩阵存储
            if (list_list_Schedule != null) {
                HttpSession session = request.getSession();
                session.setAttribute("schedule_list", list_list_Schedule);              //向jsp页面发送list_list_Schedule为空
                return "queryMajorSchedule_success";                            //返回"queryMajorSchedule_success"，跳转到指定页面
            } else {
                return "queryMajorSchedule_failure";            //list_list_Schedule为空，跳转到失败页面
            }
        } else {
            return "queryMajorSchedule_failure";            //未成功获取majorid_String，跳转到失败页面
        }
    }

    public String queryTeacherSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据教师编号tid，查看教师授课课表，通过 request.getParameter("tid") 获取jsp页面的tid
         * @param
         * @output:
         * @Date: Created in 18:17 2017/4/6
         * @Modified By:
         */

        return "";
    }

    public String queryStudentSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据学号stuid，查看学生个人课表，通过 request.getParameter("stuid") 获取jsp页面的stuid
         * @param
         * @output:
         * @Date: Created in 18:17 2017/4/6
         * @Modified By:
         */

        return "";
    }

}
