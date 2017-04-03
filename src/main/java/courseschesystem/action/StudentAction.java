package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class StudentAction extends SuperAction implements ModelDriven<List<Student>>{

    private static final long serialVersionUID = 1L;
    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getModel() {

        return this.students;
    }

    public String getStudentNumByMajor(){
        /**
         * @Author: zzh
         * @Description: 根据专业号majorid，统计本专业学生总数，
         *                通过 request.getParameter("majorid") 获取jsp页面的majorid
         *                通过 session.setAttribute("stuNumByMajor", stuNumByMajor) 给jsp页面返回学生数 stuNumByMajor
         * @output: return "getStudentNumByMajor_success" if count success, or return "getStudentNumByMajor_success"
         * @Date: Created in 2:23 2017/4/2
         * @Modified By:
         */

        return "";
    }

    public String getStudentNumByCourse(){
        /**
         * @Author: zzh
         * @Description: 根据课程号cno，统计上某门课的学生总数，
         *                通过 request.getParameter("cno") 获取jsp页面的cno
         *                通过 session.setAttribute("stuNumByCourse", stuNumByCourse) 给jsp页面返回学生数 stuNumByCourse
         * @output: return "getStudentNumByCourse_success" if count success, or return "getStudentNumByCourse_success"
         * @Date: Created in 2:26 2017/4/2
         * @Modified By:
         */

        return "";
    }

    public String stuCourseNumCount(){
        /**
         * @Author: zzh
         * @Description: 根据学号tno，统计某学生每周的课程数，
         *                通过 request.getParameter("tno") 获取jsp页面的tno
         *                通过 session.setAttribute("stuCourseNum", stuCourseNum) 给jsp页面返回学生数 stuCourseNum
         * @output: return "stuCourseNumCount_success" if count success, or return "stuCourseNumCount_success"
         * @Date: Created in 12:10 2017/4/2
         * @Modified By:
         */

        return "";
    }

    public String stuCourseTimeCount(){
        /**
         * @Author: zzh
         * @Description: 根据学号tno，统计某学生每周的上课时长，
         *                通过 request.getParameter("tno") 获取jsp页面的tno
         *                通过 session.setAttribute("stuCourseTime", stuCourseTime) 给jsp页面返回学生数 stuCourseTime
         * @output: return "stuCourseTimeCount_success" if count success, or return "stuCourseTimeCount_success"
         * @Date: Created in 12:10 2017/4/2
         * @Modified By:
         */

        return "";
    }

}
