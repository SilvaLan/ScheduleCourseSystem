package courseschesystem.dao.impl;

import courseschesystem.dao.StudentDAO;
import courseschesystem.entity.Student;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2017/4/1.
 */
public class StudentDAOImpl implements StudentDAO {
    public boolean addStudent(Student student) {
        /**
         * @Author: Lily
         * @Description: 实现StudentDAO抽象类中的addStudent方法，添加Student
         * @param student
         * @output: return true if adding succeeds,return false if adding failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */
        String sql="insert into student values('"+student.getStuid()+
                "','"+student.getStuname()+
                "','"+student.getStusex()+
                "','"+student.getStubirth()+
                "','"+student.getStuIDnum()+
                "','"+student.getSturace()+
                "','"+student.getStuindate()+
                "','"+student.getClassid()+
                "','"+student.getMajorid()+
                "','"+student.getAid()+
                "','"+student.getMail()+
                "','"+student.getEdu()+"')";
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

    public boolean deleteStudent(Student student) {
        /**
         * @Author: Lily
         * @Description: 实现StudentDAO抽象类中的deleteStudent方法，删除Student
         * @param student
         * @output: return true if deleting succeeds,return false if deleting failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try
        {
            sql = "delete from student where stuid='" + student.getStuid() + "'";
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

    public boolean updateStudent(Student student) {
        /**
         * @Author: Lily
         * @Description: 实现StudentDAO抽象类中的updateStudent方法，修改Student
         * @param student
         * @output: return true if updating succeeds,return false if updating failed
         * @Date: Created in 17:18 2017/4/1
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try {
            sql = "update student set stuname='" + student.getStuname() +
                    "',stusex='" + student.getStusex() +
                    "',stubirth='" + student.getStubirth() +
                    "',stuIDnum='" + student.getStuIDnum() +
                    "',sturace='" + student.getSturace() +
                    "',stuindate='" + student.getStuindate() +
                    "',classid='" + student.getClassid() +
                    "',majorid='" + student.getMajorid() +
                    "',aid='" + student.getAid() +
                    "',mail='" + student.getMail() +
                    "',edu='" + student.getEdu() +
                    "' where stuid='" + student.getStuid() + "'";
            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
            tx.commit();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            tx.commit();
            return false;
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
    }

    public List<Student> queryStudent(Student student) {
        /**
         * @Author: Lily
         * @Description:
         * @param student
         * @output: return the list of students if querying succeeds,return null if querying fails
         * @Date: Created in 17:23 2017/3/30
         * @Modified By: zzh
         */
        String sql;
        Transaction tx = null;
        List<Student> students = new ArrayList<>();

        try {

            sql="select * from student where 1=1";

            if(student.getStuid()!=null&&student.getStuid()!=""){
                sql=sql+" and stuid='"+student.getStuid()+"'";
            }
            if(student.getStuname()!=null&&student.getStuname()!=""){
                sql=sql+" and stuname='"+student.getStuname()+"'";
            }
            if(student.getStusex()!=null&&student.getStusex()!=""){
                sql=sql+" and stusex='"+student.getStusex()+"'";
            }
            if(student.getStubirth()!=null){
                sql=sql+" and stubirth='"+student.getStubirth()+"'";
            }
            if(student.getStuIDnum()!=null&&student.getStuIDnum()!=""){
                sql=sql+" and stuIDnum='"+student.getStuIDnum()+"'";
            }
            if(student.getSturace()!=null&&student.getSturace()!="") {
                sql = sql + " and sturace='" + student.getSturace() + "'";
            }
            if(student.getStuindate()!=null) {
                sql = sql + " and stuindate='" + student.getStuindate() + "'";
            }
            if(student.getClassid()!=null&&student.getClassid()!=""){
                sql=sql+" and classid='"+student.getClassid()+"'";
            }
            if(student.getMajorid()!=null&&student.getMajorid()!=""){
                sql=sql+" and majorid='"+student.getMajorid()+"'";
            }
            if(student.getAid()!=null&&student.getAid()!=""){
                sql=sql+" and aid='"+student.getAid()+"'";
            }
            if(student.getMail()!=null&&student.getMail()!=""){
                sql=sql+" and mail='"+student.getMail()+"'";
            }
            if(student.getEdu()!=null&&student.getEdu()!=""){
                sql=sql+" and edu='"+student.getEdu()+"'";
            }


            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            students = session.createSQLQuery(sql).addEntity(Student.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
        if (students!= null)
            return students;
        else
            return null;
    }
}
