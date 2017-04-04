package courseschesystem.service.impl;

import courseschesystem.dao.StudentDAO;
import courseschesystem.dao.impl.StudentDAOImpl;
import courseschesystem.entity.Course;

/**
 * Created by zzh on 2017/3/29.
 */
public class StudentServiceImpl {

    public int getStudentNum(String keyType,String key){
        /**
         * @Author: Yang
         * @Description: 根据关键字，统计学生数量
         * @param keyType 关键词类型 {course,major}
         * @param key
         * @output: 返回学生数量
         * @Date: Created in 11:33 2017/4/2
         * @Modified By:
         */
        int StudentNum=0;
        StudentDAO studentDAO = new StudentDAOImpl();
        //如果关键字类型为course则调用findByCourse函数返回学生集合
        if(keyType.equals("course")){
            Course course = new Course();
            course.setAid(key);
            StudentNum = studentDAO.findByCourse(course).size();
            return StudentNum;
        }
        //如果关键字类型为major则调用findByMajor函数返回学生集合
        else if(keyType.equals("major")){
            StudentNum = studentDAO.findByMajor(key).size();
            return StudentNum;
        }
        else return -1;
    }




}
