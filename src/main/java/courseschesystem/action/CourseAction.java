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

    public String getCourse(){
        CourseService courseService = new CourseServiceImpl();
        HttpSession session = request.getSession();
        courseService.getCourse(session.getAttribute("courseid").toString());
        return "";
    }

}
