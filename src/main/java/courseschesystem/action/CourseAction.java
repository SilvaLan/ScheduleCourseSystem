package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Course;

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

    @Override
    public List<Course> getModel() {
        return this.courses;
    }

    public String queryMajorSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据专业号majorid，查看本专业推荐课表，通过 request.getParameter("majorid") 获取jsp页面的majorid
         * @output: return "queryMajorSchedule_success" or "queryMajorSchedule_failure"
         * @Date: Created in 12:04 2017/4/1
         * @Modified By:
         */


        return "";
    }

    public String queryStudentSchedule(){
        /**
         * @Author: zzh
         * @Description: 根据学号stuID，查看学生个人课表，通过 request.getParameter("stuid") 获取jsp页面的stuid
         * @output: return "queryStudentSchedule_success" or "queryStudentSchedule_failure"
         * @Date: Created in 12:04 2017/4/1
         * @Modified By:
         */

        return "";
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

        return "";
    }

}
