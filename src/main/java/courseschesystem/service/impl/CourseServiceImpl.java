package courseschesystem.service.impl;

import courseschesystem.entity.Course;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 2:21 2017/4/2
 * @Modified By:
 */
public class CourseServiceImpl {

    public List<Course> queryScheduleByKey(String keyType,String key){
        /**
         * @Author: zzh
         * @Description: 根据关键字，对课程表进行查询
         * @param keyType, 关键字类型{"stuid","tid","majorid"}
         * @param key
         * @output: 返回课程的List表
         * @Date: Created in 11:27 2017/4/2
         * @Modified By:
         */


        return null;
    }

    public List<List<Course>> listToMatrix(List<Course> courses){
        /**
         * @Author: zzh
         * @Description: 将课程表从线性list转换为二维矩阵存储，
         *                行表示第几节课，列表示周几，参见学校教务系统个人课表形式
         * @param courses
         * @output: 返回课表二维形式
         * @Date: Created in 11:54 2017/4/2
         * @Modified By:
         */

        return null;
    }

    public List<Integer> getCourseTime(String times){
        /**
         * @Author: zzh
         * @Description: 上课时间为String类型，将其存储到整型数组中
         * @param times
         * @output: 返回上课时间list
         * @Date: Created in 16:25 2017/4/3
         * @Modified By:
         */

        return null;
    }

}
