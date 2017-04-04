package courseschesystem.dao;

import courseschesystem.entity.Course;
import courseschesystem.entity.Student;
import courseschesystem.entity.Teacher;

import java.util.List;

/**
 * @Author: Lily
 * @Description: Coursede接口类
 * @Date: Created in 11:47 2017/4/1
 * @Modified By:
 */
public interface CourseDAO {
    /**
     * @Author: Lily
     * @Description:Course的接口类
     * @Date: Created in 11:53 2017/4/1
     * @Modified By:
     */
    boolean addCourse(Course course);
    boolean deleteCourse(Course course);
    boolean updateCourse(Course course);
    List<Course> queryCourse(Course course);
    List<Course> findByTeacher(Teacher teacher);
    List<Course> findByStudent(Student student);
    List<Course> findByMajor(String majorId);
    String findCourseTimeByCourse(Course course);
}
