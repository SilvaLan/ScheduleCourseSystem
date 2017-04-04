package courseschesystem.service.impl;

import courseschesystem.dao.CourseDAO;
import courseschesystem.dao.impl.CourseDAOImpl;
import courseschesystem.entity.Course;
import courseschesystem.entity.Student;
import courseschesystem.entity.Teacher;

import java.util.ArrayList;
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
         * @Author: Yang
         * @Description: 根据关键字，对课程表进行查询
         * @param keyType, 关键字类型{"stuid","tid","majorid"}
         * @param key
         * @output: 返回课程的List表
         * @Date: Created in 11:27 2017/4/2
         * @Modified By:
         */
        List<Course> courses = new ArrayList<>();
        CourseDAO courseDAO = new CourseDAOImpl();
        //根据不同的关键字类型调用CourseDAO接口的不同方法返回课表
        if(keyType.equals("stuid")){
            Student student = new Student();
            student.setAid(key);
            courses = courseDAO.findByStudent(student);
        }
        else if(keyType.equals("tid")){
            Teacher teacher = new Teacher();
            teacher.setAid(key);
            courses = courseDAO.findByTeacher(teacher);
        }
        else if(keyType.equals("majorid")){
            courses = courseDAO.findByMajor(key);
        }
        if(courses != null)
            return courses;
        else return null;
    }

    public  Course[][] listToMatrix(List<Course> courses){
        /**
         * @Author: Yang
         * @Description: 将课程表从线性list转换为二维矩阵存储，
         *                行表示第几节课，列表示周几，参见学校教务系统个人课表形式
         * @param courses
         * @output: 返回课表二维形式
         * @Date: Created in 11:54 2017/4/2
         * @Modified By:
         */
        Course[][] CourseMatrix=new  Course[6][11];     //用矩阵来描述课表
        CourseDAO courseDAO = new CourseDAOImpl();
        //找到每门课程的上课时间
        for(Course course : courses ){
            String courseTime = courseDAO.findCourseTimeByCourse(course);
            String[] courseTimeArray = courseTime.split(",");    //将类似“11，12,13”字符串表示的时间分割数字存到该数组内
            //通过循环来每门课程的上课时间数组来写入课表矩阵
            for(int i = 0; i < courseTimeArray.length; i++){
                int courseIndex;    //表示第几节课
                int weekIndex;    //表示周几
                int num = Integer.parseInt(courseTimeArray[i]);    //将时间字符串转换为数字
                courseIndex = (num-1) / 10;
                weekIndex = num % 10;
                //余数为0说明是第十节课
                if(weekIndex == 0) {
                    weekIndex = 10;
                }
                CourseMatrix[weekIndex][courseIndex] = course;    //CourseMatrix[i][j]的值即为周i第j节的课程
            }
        }
        return CourseMatrix;
    }
}
