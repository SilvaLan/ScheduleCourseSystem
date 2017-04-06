package courseschesystem.dao;

import courseschesystem.entity.Course;
import courseschesystem.entity.Student;

import java.util.List;

/**
 * @Author: Lily
 * @Description:Student的接口类
 * @Date: Created in 11:53 2017/4/1
 * @Modified By:
 */
public interface StudentDAO {
    /**
     * @Author: Lily
     * @Description:  Student的接口类
     * @Date: Created in 10:46 2017/4/1
     * @Modified By:
     */
    boolean addStudent(Student student);
    boolean deleteStudent(Student student);
    boolean updateStudent(Student student);
    List<Student> queryStudent(Student student);

    List<Course> queryCourseByStudent(Student student);

    List<Student> findByCourse(Course course);
    List<Student> findByMajor(String majorId);
}
