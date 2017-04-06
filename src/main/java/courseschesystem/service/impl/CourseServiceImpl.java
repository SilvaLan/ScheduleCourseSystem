package courseschesystem.service.impl;

import courseschesystem.dao.CourseDAO;
import courseschesystem.dao.impl.CourseDAOImpl;
import courseschesystem.service.CourseService;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 20:06 2017/4/5
 * @Modified By:
 */
public class CourseServiceImpl implements CourseService{

    public boolean modifyCoursetimeToCourse(String coursetime){
        /**
         * @Author: zzh
         * @Description: 将上课时间添加到course表中cid对应的记录中
         * @param coursetime
         * @output:
         * @Date: Created in 16:31 2017/4/6
         * @Modified By:
         */
        CourseDAO courseDAO = new CourseDAOImpl();
        Course course = new Course();
        course.setCoursetime(coursetime);
        return courseDAO.updateCourse(course);
    }

}
