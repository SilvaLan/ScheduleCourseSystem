package courseschesystem.service.impl;

import courseschesystem.dao.ClassroomDAO;
import courseschesystem.dao.impl.ClassroomDAOImpl;
import courseschesystem.entity.Classroom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class ClassroomServiceImpl {

    public List<Classroom> queryClassroomByDate(Date date){
        /**
         * @Author: zzh
         * @Description: 根据日期查询教室使用情况
         * @param date 日期
         * @output: 返回教室使用信息，存储在List中
         * @Date: Created in 11:23 2017/4/2
         * @Modified By:
         */

        List<Classroom> classrooms = new ArrayList<>();
        ClassroomDAO classroomDao = new ClassroomDAOImpl();
        classrooms = classroomDao.queryClassroomByDate(date);
        if(classrooms != null)
            return classrooms;
        else return null;
    }

}
