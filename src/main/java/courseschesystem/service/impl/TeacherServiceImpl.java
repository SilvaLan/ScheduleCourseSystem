package courseschesystem.service.impl;

import courseschesystem.dao.CourseDAO;
import courseschesystem.dao.impl.CourseDAOImpl;
import courseschesystem.entity.Course;
import courseschesystem.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description: 面向教师用户的 相关业务方法
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public class TeacherServiceImpl {

    public int courseTimeCount(String time, String tno) {
        /**
         * @Author: zzh
         * @Description: 按time统计教师一个周总的，或者某一天的上课时长
         * @param time {total，monTime，tuseTime，wedsTime，hursTime，FriTime，saturTime，sunTime}
         * @param tno 教师编号
         * @output: 返回时长总和
         * @Date: Created in 12:04 2017/4/2
         * @Modified By:
         */
        int totalClassLength = 0;    //统计教师上课总时长
        int t1 = 0; int t2 = 0; int t3 = 0; int t4 = 0; int t5 = 0;//分别记录周一至周五每天的上课时长
        CourseDAO courseDAO = new CourseDAOImpl();
        List<Course> courses = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.setAid(tno);
        courses = courseDAO.findByTeacher(teacher);//获得该老师一周内的上课情况

        //遍历Course的List集合，计算每门课每天的上课时长并累加得到老师一天上课的总时长
        for (Course course : courses) {
            String courseTime = courseDAO.findCourseTimeByCourse(course);
            String[] courseTimeArray = courseTime.split(",");    //将类似“11，12,13”字符串表示的时间分割数字存到该数组内
            for(int i = 0; i < courseTimeArray.length; i++){
                int t = (Integer.parseInt(courseTimeArray[i])-1) / 10 ;    //t表示这门课程在周几上
                switch(t) {
                    case 0 : {
                        t1 += 1;
                        break;
                    }
                    case 1 : {
                        t2 += 1;
                        break;
                    }
                    case 2 : {
                        t3 += 1;
                        break;
                    }
                    case 3 : {
                        t4 += 1;
                        break;
                    }
                    case 4 : {
                        t5 += 1;
                        break;
                    }
                    default : break;
                }
            }
        }
        //根据time不同的值为totalClassLength变量附上相应的值
        switch (time){
            case("mon") : {
                totalClassLength = t1;
                break;
            }
            case("tues") : {
                totalClassLength = t2;
                break;
            }
            case("weds") : {
                totalClassLength = t3;
                break;
            }
            case("hurs") : {
                totalClassLength = t4;
                break;
            }
            case("fri") : {
                totalClassLength = t5;
                break;
            }
            case("total") : {
                totalClassLength = t1+t2+t3+t4+t5;
            }
            default : break;
        }
        return totalClassLength;
    }

    public int tCourseNumCount(String tno) {
        /**
         * @Author: Yang
         * @Description: 统计教师一周内需要授课的总门数
         * @param tno 教师编号
         * @output: 返回总门数
         * @Date: Created in 12:07 2017/4/2
         * @Modified By:
         */
        int courseNum = 0;    //统计一周内的课程总门数
        CourseDAO courseDAO = new CourseDAOImpl();
        List<Course> courses = new ArrayList<>();
        Teacher teacher = new Teacher();
        teacher.setAid(tno);
        courses = courseDAO.findByTeacher(teacher);//获得该老师一周内的上课情况
        courseNum = courses.size();
        return courseNum;

    }

}
