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

}
