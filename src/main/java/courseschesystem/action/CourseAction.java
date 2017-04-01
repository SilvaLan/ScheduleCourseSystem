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

    public String queryMajorSchedule(String majorID){
        /**
         * @Author: zzh
         * @Description: 根据专业号，查看本专业推荐课表
         * @param majorID
         * @output: return "queryMajorSchedule_success" or "queryMajorSchedule_failure"
         * @Date: Created in 12:04 2017/4/1
         * @Modified By:
         */


        return "";
    }

    public String queryStudentSchedule(String stuID){
        /**
         * @Author: zzh
         * @Description: 根据学号，查看学生个人课表
         * @param stuID
         * @output: return "queryStudentSchedule_success" or "queryStudentSchedule_failure"
         * @Date: Created in 12:04 2017/4/1
         * @Modified By:
         */

        return "";
    }

    public String queryTeacherSchedule(String tid){
        /**
         * @Author: zzh
         * @Description: 根据教师工号，查看教师课表
         * @param tid
         * @output: return "queryTeacherSchedule_success" or "queryTeacherSchedule_failure"
         * @Date: Created in 12:06 2017/4/1
         * @Modified By:
         */

        return "";
    }

}
