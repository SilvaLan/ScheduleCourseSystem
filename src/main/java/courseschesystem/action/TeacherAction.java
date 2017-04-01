package courseschesystem.action;

import courseschesystem.entity.Teacher;

/**
 * Created by zzh on 2017/3/29.
 */
public class TeacherAction {

    public String courseTimeCount(int totalTime,int monTime,int tuseTime,int wedsTime,
                              int thersTime,int friTime,int saturTime,int sunTime,
                              Teacher teacher){
        /**
         * @Author: zzh
         * @Description:
         * @param totalTime 统计教师本学期每星期需要上课的时长，周一到周日的时长
         * @param monTime 周一上课总时长
         * @param tuseTime 周二上课总时长
         * @param wedsTime 周三上课总时长
         * @param thersTime 周四上课总时长
         * @param friTime 周五上课总时长
         * @param saturTime 周六上课总时长
         * @param sunTime 周日上课总时长
         * @param teacher teacher对象
         * @output: return "courseTimeCount_success" if succeed or return "courseTimeCount_failure"
         * @Date: Created in 2:09 2017/4/2
         * @Modified By:
         */

        return "";
    }

    public String courseNumCount(int totalNum,Teacher teacher){
        /**
         * @Author: zzh
         * @Description:
         * @param totalNum 统计教师本学期教授课程的总门数
         * @param teacher
         * @output: return "courseNumCount_success" if succeed or return "courseNumCount_failure"
         * @Date: Created in 2:16 2017/4/2
         * @Modified By:
         */

        return "";
    }

}
