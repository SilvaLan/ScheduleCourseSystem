package courseschesystem.service;

import courseschesystem.entity.Course;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 2:20 2017/4/2
 * @Modified By:
 */
public interface CourseService {

    //根据关键词类型和关键词内容，查询相应的课表，存储在List中
    List<Course> queryScheduleByKey(String keyType, String key);
    //将一维表转化为二维形式
    List<List<Course>> listToMatrix(List<Course> courses);
}
