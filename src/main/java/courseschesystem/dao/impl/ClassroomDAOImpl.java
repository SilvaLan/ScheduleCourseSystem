package courseschesystem.dao.impl;

import courseschesystem.dao.ClassroomDAO;
import courseschesystem.entity.Classroom;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2017/3/29.
 */
public class ClassroomDAOImpl implements ClassroomDAO {
    public boolean addClassroom(Classroom classroom) {
        /**
         * @Author: Lily
         * @Description: 实现ClassroomDAO抽象类中的addClassroom方法，添加Classroom
         * @param classroom
         * @output: return true if adding succeeds,return false if adding failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */
        String sql = "insert into Classroom values('" + classroom.getRid() +
                "','" + classroom.getRname() +
                "','" + classroom.getSeatnum() +
                "')";
        org.hibernate.Transaction tx;

        Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        // 执行SQL语句
        session.createSQLQuery(sql).executeUpdate();
        // 提交事务
        tx.commit();
        // 事务清空
        if (tx != null) {
            tx = null;
        }
        return true;
    }

    public boolean deleteClassroom(Classroom classroom) {
        /**
         * @Author: Lily
         * @Description: 实现ClassroomDAO抽象类中的deleteClassroom方法，删除Classroom
         * @param classroom
         * @output: return true if deleting succeeds,return false if deleting failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */

        String sql;
        org.hibernate.Transaction tx = null;
        try {
            sql = "delete from Classroom where rid='" + classroom.getRid() + "'";
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
            tx.commit();
            System.out.println("delete sql = " + sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
            return false;
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
    }

    public boolean updateClassroom(Classroom classroom) {
        /**
         * @Author: Lily
         * @Description: 实现ClassroomDAO抽象类中的updateClassroom方法，修改Classroom
         * @param classroom
         * @output: return true if updating succeeds,return false if updating failed
         * @Date: Created in 17:18 2017/4/1
         * @Modified By:
         */
        String sql;
        org.hibernate.Transaction tx = null;
        try {
            sql = "update Classroom set rname='" + classroom.getRname() +
                    "',seatnum='" + classroom.getSeatnum() +
                    "' where rid='" + classroom.getRid() + "'";
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
            return false;
        } finally {
            if (tx != null) {
                tx = null;
            }
        }

    }

    public List<Classroom> queryClassroom(Classroom classroom) {
        /**
         * @Author: Lily
         * @Description:
         * @param classroom
         * @output: return the list of classrooms if querying succeeds,return null if querying fails
         * @Date: Created in 17:23 2017/4/1
         * @Modified By:
         */

        String sql = "select * from Classroom where rid='" + classroom.getRid() + "'";
        org.hibernate.Transaction tx;

        Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        List<Classroom> classrooms = new ArrayList<>();
        // 执行SQL语句
        classrooms = session.createSQLQuery(sql).addEntity(Classroom.class).list();
        // 提交事务
        tx.commit();
        // 清空事务
        if (tx != null) {
            tx = null;
        }
        if (classrooms != null)
            return classrooms;
        else
            return null;
    }
}
