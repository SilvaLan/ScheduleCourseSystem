package courseschesystem.action;

/**
 * Created by zzh on 2017/3/29.
 */
public class TeacherAction {

    public String courseTimeCount(){
        /**
         * @Author: zzh
         * @Description: 根据教师编号tno，统计教师本学期每星期需要上课的时长，周一到周日的时长
         *                通过 request.getParameter("tno") 获取jsp页面的 tno
         *                通过 session.setAttribute("totalTime", totalTime) 给jsp页面返回总时长 totalTime
         *                monTime、tuseTime、wedsTime、thursTime、friTime、saturTime、sunTime 与 totalTime 类似
         * @output: return "courseTimeCount_success" if succeed or return "courseTimeCount_failure"
         * @Date: Created in 2:09 2017/4/2
         * @Modified By:
         */

        return "";
    }

    public String courseNumCount(){
        /**
         * @Author: zzh
         * @Description: 根据教师编号tno，统计教师本学期教授课程的总门数
         *                通过 request.getParameter("tno") 获取jsp页面的 tno
         *                通过 session.setAttribute("totalNum", totalNum) 给jsp页面返回总门数 totalNum
         * @output: return "courseNumCount_success" if succeed or return "courseNumCount_failure"
         * @Date: Created in 2:16 2017/4/2
         * @Modified By:
         */

        return "";
    }

}
