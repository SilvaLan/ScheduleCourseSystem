package courseschesystem.service;

import courseschesystem.entity.Course;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 20:05 2017/4/5
 * @Modified By:
 */
public interface CourseService {

    // 根据关键字，对课程表进行查询
    List<Course> queryScheduleByKey(String keyType, String key);
    // 将课程表从线性list转换为二维矩阵存储
    Course[][] listToMatrix(List<Course> courses);
}
