package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.dao.StudentDAO;
import courseschesystem.entity.Course;
import courseschesystem.entity.Student;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2017/4/1.
 */
public class StudentDAOImpl extends BaseHibernateDAO implements StudentDAO {
    public boolean add(Student student) {
        return super.add(student);
    }

    public boolean delete(Student student) {
        return super.delete(student);
    }

    public boolean update(Student student) {
        return super.update(student);
    }

    public Student get(String id){
        return (Student)super.get(Student.class,id);
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

    /**
     * 查询某门课程的选课情况
     * @param course 课程
     * @return 选了该门课程的所有学生
     */
    public List<Student> findByCourse(Course course){
        List<Student> students = new ArrayList<>();


        return students;
    }

    /**
     * 查询某专业的选课情况
     * @param majorId 专业
     * @return 选了该专业的所有学生
     */
    public List<Student> findByMajor(String majorId){
        List<Student> students = new ArrayList<>();


        return students;
    }
}
