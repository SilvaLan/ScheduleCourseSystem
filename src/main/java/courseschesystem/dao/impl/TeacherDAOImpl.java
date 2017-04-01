package courseschesystem.dao.impl;

import courseschesystem.dao.TeacherDAO;
import courseschesystem.entity.Teacher;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2017/3/29.
 */
public class TeacherDAOImpl implements TeacherDAO{
    public boolean addTeacher(Teacher teacher)
    {
        /**
         * @Author: Lily
         * @Description: 实现TeacherDAO抽象类中的addTeacher方法，添加Teacher
         * @param teacher
         * @output: return true if adding succeeds,return false if adding failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */
        String sql="insert into Teacher values('"+teacher.getTid()+"','"+
                teacher.getTname()+",'" +
                teacher.getTsex()+ "','"+
                teacher.getTbirth()+"','" +
                teacher.gettIDnun()+"','" +
                teacher.getTrace()+"','" +
                teacher.getTindate()+"','" +
                teacher.getAid()+"','" +
                teacher.getMail()+"')";
        Transaction tx;

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

    public boolean deleteTeacher(Teacher teacher) {
        /**
         * @Author: Lily
         * @Description: 实现TeacherDAO抽象类中的deleteTeacher方法，删除Teacher
         * @param teacher
         * @output: return true if deleting succeeds,return false if deleting failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try
        {
            sql="delete from Teacher where tid='"+teacher.getTid()+"'";
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
            tx.commit();
            System.out.println("delete sql = " + sql);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            tx.commit();
            return false;
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
    }

    public boolean updateTeacher(Teacher teacher) {
        /**
         * @Author: Lily
         * @Description: 实现TeacherDAO抽象类中的updateTeacher方法，修改Teacher
         * @param teacher
         * @output: return true if updating succeeds,return false if updating failed
         * @Date: Created in 17:18 2017/4/1
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try {

            sql = "update Teacher set tname='" + teacher.getTname() +
                    "', tsex='" + teacher.getTsex() +
                    "',tbirth='" + teacher.getTbirth() +
                    "',tIDnum='" + teacher.gettIDnun() +
                    "',trace='" + teacher.getTrace() +
                    "', tindate='" + teacher.getTindate() +
                    "',aid='" + teacher.getAid() +
                    "',mail='" + teacher.getMail() +
                    "' where tid='" + teacher.getTid() +
                    "'";
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

    public List<Teacher> queryTeacher(Teacher teacher) {
        /**
         * @Author: Lily
         * @Description:
         * @param teacher
         * @output: return the list of teachers if querying succeeds,return null if querying fails
         * @Date: Created in 17:23 2017/4/1
         * @Modified By:
         */
        String sql="select * from Teacher where tid='"+teacher.getTid()+"'";
        Transaction tx;

        Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        List<Teacher> teachers = new ArrayList<>();
        teachers = session.createSQLQuery(sql).addEntity(Teacher.class).list();
        tx.commit();

        if (tx != null) {
            tx = null;
        }

        if (teachers != null)
            return teachers;
        else
            return null;
    }
}
