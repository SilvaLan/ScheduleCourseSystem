package courseschesystem.service.impl;

import courseschesystem.dao.ClassroomDAO;
import courseschesystem.dao.impl.ClassroomDAOImpl;
import courseschesystem.service.AdminService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: zzh
 * @Description: 面向教务系统管理员的 相关业务方法
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public class AdminServiceImpl implements AdminService{

    public List<Classroom> queryClassroomByDate(Date date){
        /**
         * @Author: Yang
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
