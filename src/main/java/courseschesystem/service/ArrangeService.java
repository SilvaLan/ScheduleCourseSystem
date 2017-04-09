package courseschesystem.service;

import courseschesystem.entity.Activity;
import courseschesystem.entity.Arrange;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:20 2017/4/6
 * @Modified By:
 */
public interface ArrangeService {

    //按week和num查看教室使用情况
    List<Arrange> queryArrangeByDate(int week,int day);
    // 为某门课程排课，若无冲突，则排课成功
    boolean arrangeCourse(String courseid, String rid,int week, int courseIndex);
    // 检查courseid是否合法
    boolean checkCourseid(String courseid);
    // 检查教室rid在第week周的第courseIndex节课，是否被使用
    boolean checkClassroomArrange(String rid, int week, int courseIndex);
    // 检查第i周第j节课，该教师没有其他授课任务
    boolean checkTeacherInstruction(String courseid,int week, int courseIndex);
    // 获得安排的Activity的信息
    Activity getActivity(String acid);

}
