package courseschesystem.service;

import courseschesystem.common.Schedule;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 15:31 2017/4/6
 * @Modified By:
 */
public interface ScheduleService {

    // 根据关键字，查询课表
    List<Schedule> queryScheduleByKey(String keyType, String key);
    //将一维课表转换为二维课表
    Schedule[][] listToMatrix(List<Schedule> schedules);


}
