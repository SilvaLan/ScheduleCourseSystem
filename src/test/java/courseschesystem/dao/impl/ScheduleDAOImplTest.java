package courseschesystem.dao.impl;

import courseschesystem.common.Schedule;
import courseschesystem.dao.ScheduleDAO;
import junit.framework.TestCase;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 8:57 2017/4/9
 * @Modified By:
 */
public class ScheduleDAOImplTest extends TestCase {
    public void testQueryScheduleByTid() throws Exception {

        String tid = "2014002001";
        ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
        List<Schedule> schedules = scheduleDAO.queryScheduleByTid(tid);
        for (Schedule schedule:schedules) {
            System.out.println(schedule.toString());
        }
    }

}