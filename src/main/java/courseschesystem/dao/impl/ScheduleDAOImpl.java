package courseschesystem.dao.impl;

import courseschesystem.common.Schedule;
import courseschesystem.dao.ScheduleDAO;
import db.MyHibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 15:41 2017/4/6
 * @Modified By:
 */
public class ScheduleDAOImpl implements ScheduleDAO{

    public List<Schedule> queryScheduleByStuid(String stuid){

        return  null;
    }

    public List<Schedule> queryScheduleByTid(String tid){
        List<Schedule> schedules = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql = "select new courseschesystem.common.Schedule(teacher.tid," +
                "teacher.tname,course.courseid,course.coursename, major.majorid,major.majorname,room.rid,room.rname,course.coursetime) " +
                "from Arrange as arrange " +
                "full join (select * from Course course " +
                    "full join Teacher teacher on course.tid = teacher.tid " +
                    "full join Major major on course.majorid = major.majorid ) as c " +
                "on arrange.caid = c.courseid " +
                "full join Classroom room on arrange.rid = room.rid, " +
                "where teacher.tid = ? " ;
        Query query = session.createQuery(hql);
        query.setString(0,tid);
        List list = query.list();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            schedules.add((Schedule) iterator.next());
        }
        return schedules;
    }

    public List<Schedule> queryScheduleByMajorid(String majorid){
        return null;
    }
}
