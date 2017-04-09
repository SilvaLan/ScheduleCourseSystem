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
    boolean add( Student student);
    boolean delete(Student student);
    boolean update(Student student);
    Student get(String id);

    List<Student> queryStudent(Student student);

    List<Student> findByCourse(Course course);
    List<Student> findByMajor(String majorId);
}
