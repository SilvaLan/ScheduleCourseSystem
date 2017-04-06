package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Course;
import courseschesystem.service.CourseService;
import courseschesystem.service.impl.CourseServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 11:48 2017/4/1
 * @Modified By:
 */
public class CourseAction extends SuperAction implements ModelDriven<List<Course>> {

    private static final long serialVersionUID = 1L;
    private List<Course> courses = new ArrayList<>();
    private HttpServletRequest request;

    @Override
    public List<Course> getModel() {
        return this.courses;
    }
    private Course[][] list_list_Course;
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
            CourseService courseService = new CourseServiceImpl(); //获取CommonServiceImpl实例
            courses = courseService.queryScheduleByKey("majorid",majorid_String);       //调用queryScheduleByKey获取教室信息并存储在courses中
            list_list_Course = courseService.listToMatrix(courses);         //将课程表从线性list转换为二维矩阵存储
            if (list_list_Course != null) {
                HttpSession session = request.getSession();
                session.setAttribute("course_list", list_list_Course);              //向jsp页面发送list_list_Course
                return "queryMajorSchedule_success";                            //返回"queryMajorSchedule_success"，跳转到指定页面
            } else {
                return "queryMajorSchedule_failure";            //list_list_Course为空，跳转到失败页面
            }
        } else {
            return "queryMajorSchedule_failure";            //未成功获取majorid_String，跳转到失败页面
        }
    }

    public String queryStudentSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据学号stuID，查看学生个人课表，通过 request.getParameter("stuid") 获取jsp页面的stuid
         * @output: return "queryStudentSchedule_success" or "queryStudentSchedule_failure"
         * @Date: Created in 12:04 2017/4/1
         * @Modified By:Hu
         */
        String stuID_String = request.getParameter("stuid");   //获取学号stuID_String,类型String
        if (stuID_String != null) {
            CourseService courseService = new CourseServiceImpl();  //获取CourseServiceImpl实例
            courses = courseService.queryScheduleByKey("stuid",stuID_String);       //调用queryScheduleByKey获取教室信息并存储在courses中
            list_list_Course = courseService.listToMatrix(courses);         //将课程表从线性list转换为二维矩阵存储
            if (list_list_Course != null) {
                HttpSession session = request.getSession();
                session.setAttribute("course_list", list_list_Course);              //向jsp页面发送list_list_Course
                return "queryStudentSchedule_success";                            //返回"queryStudentSchedule_success"，跳转到指定页面
            } else {
                return "queryStudentSchedule_failure";            //list_list_Course为空，跳转到失败页面
            }
        } else {
            return "queryStudentSchedule_failure";            //未成功获取stuID_String，跳转到失败页面
        }
    }

    public String queryTeacherSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据教师编号tid，查看教师课表
         *                通过 request.getParameter("tID") 获取jsp页面的tid
         *                通过 session.setAttribute("course_list", courses) 给jsp页面返回课程表 course_list
         * @param tid
         * @output: return "queryTeacherSchedule_success" or "queryTeacherSchedule_failure"
         * @Date: Created in 12:06 2017/4/1
         * @Modified By:
         */
        String tID_String = request.getParameter("tID");   //获取教师编号tID_String,类型String
        if (tID_String != null) {
            CourseService courseService = new CourseServiceImpl();  //获取CourseServiceImpl实例
            courses = courseService.queryScheduleByKey("tid",tID_String);       //调用queryScheduleByKey获取教室信息并存储在courses中
            list_list_Course = courseService.listToMatrix(courses);         //将课程表从线性list转换为二维矩阵存储
            if (list_list_Course != null) {
                HttpSession session = request.getSession();
                session.setAttribute("course_list", list_list_Course);              //向jsp页面发送list_list_Course
                return "queryTeacherSchedule_success";                            //返回"queryTeacherSchedule_success"，跳转到指定页面
            } else {
                return "queryStudentSchedule_failure";            //list_list_Course为空，跳转到失败页面
            }
        } else {
            return "queryTeacherSchedule_failure";            //未成功获取tID_String，跳转到失败页面
        }
    }

}
