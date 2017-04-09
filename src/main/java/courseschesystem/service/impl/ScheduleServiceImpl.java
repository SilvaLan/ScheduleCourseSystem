package courseschesystem.service.impl;

import courseschesystem.dao.ScheduleDAO;
import courseschesystem.dao.impl.ScheduleDAOImpl;
import courseschesystem.common.Schedule;
import courseschesystem.service.ScheduleService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 15:31 2017/4/6
 * @Modified By:
 */
public class ScheduleServiceImpl implements ScheduleService{

    public List<Schedule> queryScheduleByKey(String keyType, String key){
        /**
         * @Author: Yang
         * @Description: 根据关键字，对课程表进行查询
         * @param keyType, 关键字类型{"stuid","tid","majorid"}
         * @param key
         * @output: 返回Schedule的List表
         * @Date: Created in 11:27 2017/4/2
         * @Modified By: zzh
         */
        List<Schedule> schedules = new ArrayList<>();
        ScheduleDAO scheduleDAO = new ScheduleDAOImpl();

        //根据不同的关键字类型调用CourseDAO接口的不同方法返回课表
        if(keyType.equals("stuid")){
            schedules = scheduleDAO.queryScheduleByStuid(key);
        }
        else if(keyType.equals("tid")){
            schedules = scheduleDAO.queryScheduleByTid(key);
        }
        else if(keyType.equals("majorid")){
            schedules = scheduleDAO.queryScheduleByMajorid(key);
        }
        if(schedules != null)
            return schedules;
        else return null;
    }

    public  Schedule[][] listToMatrix(List<Schedule> schedules){
        /**
         * @Author: Yang
         * @Description: 将课程表从线性list转换为二维矩阵存储，
         *                行表示第几节课，列表示周几，参见学校教务系统个人课表形式
         * @param courses
         * @output: 返回课表二维形式
         * @Date: Created in 11:54 2017/4/2
         * @Modified By: zzh
         */
        Schedule[][] scheduleMatrix = new  Schedule[6][11];     //用矩阵来描述课表
        int weekdayIndex;
        int courseIndex;
        for (Schedule schedule:schedules) {
            String[] courseTimeArray = schedule.getCoursetime().split(",");    //将类似“11，12,13”字符串表示的时间分割数字存到该数组内
            //通过循环来每门课程的上课时间数组来写入课表矩阵
            for(int i = 0; i < courseTimeArray.length; i++){
                int num = Integer.parseInt(courseTimeArray[i]);    //将时间字符串转换为数字
                courseIndex = (num-1) / 10;
                weekdayIndex = num % 10;
                //余数为0说明是第十节课
                if(weekdayIndex == 0) {
                    weekdayIndex = 10;
                }
                scheduleMatrix[weekdayIndex][courseIndex] = schedule;    //CourseMatrix[i][j]的值即为周i第j节的课程
            }
        }
        return scheduleMatrix;
    }
}
