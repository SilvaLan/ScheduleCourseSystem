package courseschesystem.service;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:20 2017/4/6
 * @Modified By:
 */
public interface ArrangeService {

    // 为某门课程排课，若无冲突，则排课成功
    boolean arrangeCourse(String courseid, String rid, int courseIndex);
    // 检查courseid是否合法
    boolean checkCourseid(String courseid);
    // 检查教室rid在第week周的第courseIndex节课，是否被使用
    boolean checkClassroomArrange(String rid, int week, int courseIndex);
    // 检查第i周第j节课，该教师没有其他授课任务
    boolean checkTeacherInstruction(int week, int courseIndex);

}
