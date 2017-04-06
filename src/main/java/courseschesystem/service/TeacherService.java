package courseschesystem.service;

/**
 * @Author: zzh
 * @Description: 面向教师用户的 相关业务方法 的接口类
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public interface TeacherService {

    //统计教师的授课时长
    int[] teachTimeCount(String tid);
    //统计教师总共教授的课程总数
    int tCourseNumCount(String tid);

}
