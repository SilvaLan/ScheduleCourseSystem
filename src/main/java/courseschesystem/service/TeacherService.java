package courseschesystem.service;

/**
 * Created by zzh on 2017/3/29.
 */
public interface TeacherService {

    // 统计一周内某天，或者一周总的授课时长
    int courseTimeCount(String time, String tno);
    // 统计教师一周内需要授课的总共门数
    int tCourseNumCount(String tno);
}
