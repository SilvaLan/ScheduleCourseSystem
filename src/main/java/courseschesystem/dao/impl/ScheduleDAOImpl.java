package courseschesystem.dao.impl;

import courseschesystem.common.Schedule;
import courseschesystem.dao.ScheduleDAO;
import db.MyHibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 15:41 2017/4/6
 * @Modified By:
 */
public class ScheduleDAOImpl implements ScheduleDAO{

    public List<Schedule> queryScheduleByStuid(String stuid){
        List<Schedule> schedules = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql = "select new courseschesystem.common.Schedule(teacher.tid," +
                "teacher.tname,course.courseid,course.coursename, major.majorid,major.majorname,room.rid,room.rname,course.coursetime) " +
                "from Course course inner join Teacher teacher,Classroom room,Major major,Arrange arrange " +
                "where teacher.tid = ? " +
                "and teacher.tid = course.tid " +
                "and course.courseid = arrange.caid and arrange.rid = room.rid " +
                "and course.majorid = major.majorid ";
        Query query = session.createQuery(hql);



        return  null;
    }

    public List<Schedule> queryScheduleByTid(String tid){
        return null;
    }

    public List<Schedule> queryScheduleByMajorid(String majorid){
        return null;
    }
}
