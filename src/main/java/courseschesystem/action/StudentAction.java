package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Student;
import courseschesystem.service.impl.StudentServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class StudentAction extends SuperAction implements ModelDriven<List<Student>>{

    private static final long serialVersionUID = 1L;
    private List<Student> students = new ArrayList<>();
    private HttpServletRequest request;
    @Override
    public List<Student> getModel() {

        return this.students;
    }

    public String getStudentNumByMajor(){
        /**
         * @Author: Hu
         * @Description: 根据专业号majorid，统计本专业学生总数，
         *                通过 request.getParameter("majorid") 获取jsp页面的majorid
         *                通过 session.setAttribute("stuNumByMajor", stuNumByMajor) 给jsp页面返回学生数 stuNumByMajor
         * @output: return "getStudentNumByMajor_success" if count success, or return "getStudentNumByMajor_failure"
         * @Date: Created in 2:23 2017/4/2
         * @Modified By:
         */
        String majorid_String = request.getParameter("majorid");   //获取专业号majorid_String,类型String
        if (majorid_String!=null){
            StudentServiceImpl studentService = new StudentServiceImpl();       //获取StudentServiceImpl实例
            int stuNumByMajor = studentService.getStudentNum("major",majorid_String);      //调用getStudentNum获取学生数量
            if(stuNumByMajor >=0){                          //人数>=0
                HttpSession session = request.getSession();
                session.setAttribute("stuNumByMajor",stuNumByMajor);        //向jsp页面发送stuNumByMajor
                return "getStudentNumByMajor_success";
            }else{
                return "getStudentNumByMajor_failure";      //stuNumByMajor<0，跳转到失败页面
            }
        }else {
            return "getStudentNumByMajor_failure";      //未成功获取majorid_String，跳转到失败页面
        }
    }

    public String getStudentNumByCourse(){
        /**
         * @Author: Hu
         * @Description: 根据课程号cno，统计上某门课的学生总数
         *                通过 request.getParameter("cno") 获取jsp页面的cno
         *                通过 session.setAttribute("stuNumByCourse", stuNumByCourse) 给jsp页面返回学生数 stuNumByCourse
         * @output: return "getStudentNumByCourse_success" if count success, or return "getStudentNumByCourse_success"
         * @Date: Created in 2:26 2017/4/2
         * @Modified By:
         */
        String cno_String = request.getParameter("cno");   //获取专业号cno_String,类型String
        if (cno_String!=null){
            StudentServiceImpl studentService = new StudentServiceImpl();       //获取StudentServiceImpl实例
            int stuNumByCourse = studentService.getStudentNum("course",cno_String);      //调用getStudentNum获取学生数量
            if(stuNumByCourse >=0){                          //人数>=0
                HttpSession session = request.getSession();
                session.setAttribute("stuNumByCourse",stuNumByCourse);        //向jsp页面发送stuNumByMajor
                return "getStudentNumByCourse_success";
            }else{
                return "getStudentNumByCourse_failure";      //stuNumByMajor<0，跳转到失败页面
            }
        }else {
            return "getStudentNumByCourse_failure";      //未成功获取cno_String，跳转到失败页面
        }
    }

    //public String stuCourseNumCount(){
        /**
         * @Author: zzh
         * @Description: 根据学号stuno，统计某学生每周的课程数
         *                通过 request.getParameter("tno") 获取jsp页面的tno
         *                通过 session.setAttribute("stuCourseNum", stuCourseNum) 给jsp页面返回学生数 stuCourseNum
         * @output: return "stuCourseNumCount_success" if count success, or return "stuCourseNumCount_success"
         * @Date: Created in 12:10 2017/4/2
         * @Modified By:Hu
         */
        //String stuno_String = request.getParameter("stutno");   //获取专业号cno_String,类型String
        //if (stuno_String!=null){
        //    CourseServiceImpl courseService = new CourseServiceImpl();       //获取CourseServiceImpl实例
        //    int CourseNumByTno = courseService.getCoursNumByKey("CourseNum",stuno_String);      //调用getCourseNumByKey获取学生数量
        //    if(CourseNumByTno >=0){                          //课程数>=0
        //        HttpSession session = request.getSession();
        //        session.setAttribute("CourseNumByTno",CourseNumByTno);        //向jsp页面发送CourseNumByTno
        //        return "getCourseNumByTno_success";
        //    }else{
        //        return "getCourseNumByTno_failure";      //CourseNumByTno<0，跳转到失败页面
        //    }
        // }else {
        //    return "getCourseNumByTno_failure";      //未成功获取stuno_String，跳转到失败页面
        // }
     //   return "";
   //}

   //public String stuCourseTimeCount(){
        /**
         * @Author: zzh
         * @Description: 根据学号tno，统计某学生每周的上课时长
         *                通过 request.getParameter("tno") 获取jsp页面的tno
         *                通过 session.setAttribute("stuCourseTime", stuCourseTime) 给jsp页面返回学生数 stuCourseTime
         * @output: return "stuCourseTimeCount_success" if count success, or return "stuCourseTimeCount_success"
         * @Date: Created in 12:10 2017/4/2
         * @Modified By:Hu
         */

       // return "";
    //}

}
