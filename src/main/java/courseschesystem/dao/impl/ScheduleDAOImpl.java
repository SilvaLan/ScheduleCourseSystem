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

    //学生上课课表
    public List<Schedule> queryScheduleByStuid(String stuid){
        List<Schedule> schedules = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql ="" ;

        Query query = session.createQuery(hql);
        query.setString(0,stuid);
        List list = query.list();

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            schedules.add((Schedule) iterator.next());
        }
        return schedules;
    }

    //教师授课课表
    public List<Schedule> queryScheduleByTid(String tid){
        List<Schedule> schedules = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql ="" ;

        Query query = session.createQuery(hql);
        query.setString(0,tid);
        List list = query.list();

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            schedules.add((Schedule) iterator.next());
        }
        return schedules;
    }

    //专业推荐课表
    public List<Schedule> queryScheduleByMajorid(String majorid){

        List<Schedule> schedules = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql ="" ;

        Query query = session.createQuery(hql);
        query.setString(0,majorid);
        List list = query.list();

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            schedules.add((Schedule) iterator.next());
        }
        return schedules;
    }
}
