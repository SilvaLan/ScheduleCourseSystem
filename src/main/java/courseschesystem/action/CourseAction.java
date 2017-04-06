package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Course;

import javax.servlet.http.HttpServletRequest;
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

    public String queryCourse(){
        /**
         * @Author: zzh
         * @Description: 查看课程详细信息
         * @param
         * @output:
         * @Date: Created in 18:24 2017/4/6
         * @Modified By:
         */

        return "";
    }

}
