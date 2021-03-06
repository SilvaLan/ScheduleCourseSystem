package courseschesystem.dao;

import courseschesystem.entity.Course;

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
     * @Description: Course的接口类
     * @Date: Created in 11:53 2017/4/1
     * @Modified By:
     */
    boolean add(Course course);
    boolean delete(Course course);
    boolean update(Course course);
    Course get(String id);

    List<Course> queryCourse(Course course);

    int[] queryCourseweek(String courseid);
    String findCourseTimeByCourseid(String courseid);
}
