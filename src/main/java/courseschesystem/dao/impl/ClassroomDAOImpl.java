package courseschesystem.dao.impl;

import courseschesystem.dao.ClassroomDAO;
import courseschesystem.entity.Classroom;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        String sql = "insert into classroom values('" + classroom.getRid() +
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
            sql = "delete from classroom where rid='" + classroom.getRid() + "'";
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
            sql = "update classroom set rname='" + classroom.getRname() +
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
         * @Modified By: zzh
         */

        String sql;
        Transaction tx = null;
        List<Classroom> classrooms = new ArrayList<>();

        try {

            sql="select * from classroom where 1=1";

            if(classroom.getRid()!=null&&classroom.getRid()!=""){
                sql=sql+" and rid='"+classroom.getRid()+"'";
            }
            if(classroom.getRname()!=null&&classroom.getRname()!=""){
                sql=sql+" and =rname'"+classroom.getRname()+"'";
            }
            if(classroom.getSeatnum()>0){
                sql=sql+" and seatnum='"+classroom.getSeatnum()+"'";
            }

            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            classrooms = session.createSQLQuery(sql).addEntity(Classroom.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
        if (classrooms!= null)
            return classrooms;
        else
            return null;
    }
}
