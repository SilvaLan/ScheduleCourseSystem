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

    public String getStudentNumByMajor(int total,String majorID){
        /**
         * @Author: zzh
         * @Description: 统计本专业学生总数
         * @param total
         * @param majorID 专业号
         * @output: return "getStudentNumByMajor_success" if count success, or return "getStudentNumByMajor_success"
         * @Date: Created in 2:23 2017/4/2
         * @Modified By:
         */

        return "";
    }

    public String getStudentNumByCourse(int num,String cno){
        /**
         * @Author: zzh
         * @Description: 统计上某门课的学生的总数
         * @param num
         * @param cno 课程号
         * @output: return "getStudentNumByMCourse_success" if count success, or return "getStudentNumByCourse_success"
         * @Date: Created in 2:26 2017/4/2
         * @Modified By:
         */

        return "";
    }

}
