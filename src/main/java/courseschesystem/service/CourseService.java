package courseschesystem.service;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 20:05 2017/4/5
 * @Modified By:
 */
public interface CourseService {
    //将上课时间添加到course表中cid对应的记录中
    boolean modifyCoursetimeToCourse(String coursetime);
}
