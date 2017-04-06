package courseschesystem.dao;

import courseschesystem.entity.Schedule;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 15:34 2017/4/6
 * @Modified By:
 */
public interface ScheduleDAO {
    // 根据学号查询课表
    List<Schedule> queryScheduleByStuid(String stuid);
    // 根据教师编号查询课表
    List<Schedule> queryScheduleByTid(String tid);
    // 根据专业编号查询课表
    List<Schedule> queryScheduleByMajorid(String majorid);

}
