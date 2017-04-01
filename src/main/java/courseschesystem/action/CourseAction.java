package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Course;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 11:48 2017/4/1
 * @Modified By:
 */
public class CourseAction extends SuperAction implements ModelDriven<Course> {

    private static final long serialVersionUID = 1L;
    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> getModel() {

        return this.courses;
    }
}
