package courseschesystem.service.impl;

import courseschesystem.dao.ArrangeDAO;
import courseschesystem.dao.impl.ArrangeDAOImpl;
import courseschesystem.entity.Arrange;
import courseschesystem.service.ArrangeService;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:22 2017/4/6
 * @Modified By:
 */
public class ArrangeServiceImpl implements ArrangeService{

    public boolean arrangeCourse(String courseid,String rid,int courseIndex){
        /**
         * @Author: zzh
         * @Description: 为某门课程排课，若无冲突，则排课成功
         *                1.返回排课成功提示信息
         *                2.将教室安排记录写入arrange表 addArrange(Arrange arrange)
         *                3.添加courseid对应的课程的上课时间到course表 modifyCoursetimeToCourse(String coursetime) √
         *                4.添加courseid对应的授课的授课时间到instruction表 modifyIntimeToInstruction(String Intime)
         *                ·其他需要使用的数据：
         *                  1.获得该课程的起始周、结束周 CourseDAO.queryCourseweek(String courseid)
         *                ·不冲突需满足以下条件：
         *                  1.课程courseid合法 checkCourseid(String courseid)
         *                  2.第i周第j节课，该教室未安排活动 checkClassroomArrange(int week,int courseIndex) √
         *                  3.第i周第j节课，该教师没有其他授课任务 checkTeacherInstruction(int week,int courseIndex) √
         *                  4.该教室容量不小于选课人数 checkClassroomSize(String courseid,String rid)
         * @param courseid 课程编号 专业缩写+XXXX
         * @param rid 教室号 XXX
         * @param courseIndex 排课时间，即周几，第几节课 weekday,courseNum,通过这两个参数得到课时的号码courseIndex
         *                    如周二第5节课，weekday=2，courseNum=5，可以得到课时号码为25
         * @output: 排课成功，且对各个表的信息写入成功，则返回true，否则返回false
         * @Date: Created in 14:04 2017/4/6
         * @Modified By:
         */
        return true;
    }

    public boolean checkCourseid(String courseid){
        /**
         * @Author: zzh
         * @Description: 检查courseid是否合法
         * @param courseid
         * @output:
         * @Date: Created in 13:26 2017/4/6
         * @Modified By:
         */

        return true;
    }

    public boolean checkClassroomArrange(String rid,int week,int courseIndex){
        /**
         * @Author: zzh
         * @Description: 检查教室rid在第week周的第courseIndex节课，是否被使用 ArrangeDAO.queryArrange(Arrange arrange)
         * @param weekday
         * @param courseIndex
         * @output: 若教室未被使用，返回false；若教室已被使用，返回true
         * @Date: Created in 13:28 2017/4/6
         * @Modified By:
         */


        return true;
    }

    public boolean checkTeacherInstruction(int week,int courseIndex){
        /**
         * @Author: zzh
         * @Description: 检查第i周第j节课，该教师没有其他授课任务
         * @param week 第几周
         * @param courseIndex 第几节课
         * @output:
         * @Date: Created in 16:48 2017/4/6
         * @Modified By:
         */
        Arrange arrange = new Arrange();
        ArrangeDAO arrangeDAO = new ArrangeDAOImpl();
        //调用arrangeDAO的query方法
        return true;
    }

}
