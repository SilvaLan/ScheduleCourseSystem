package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
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
public class TeacherDAOImpl extends BaseHibernateDAO implements TeacherDAO{
    public boolean add(Teacher teacher)
    {
        return super.add(teacher);
    }

    public boolean delete(Teacher teacher) {
        return super.delete(teacher);
    }

    public boolean update(Teacher teacher) {
        return super.update(teacher);
    }

    public Teacher get(String id){
        return (Teacher)super.get(Teacher.class,id);
    }


    public List<Teacher> queryTeacher(Teacher teacher) {
        String sql;
        Transaction tx = null;
        List<Teacher> teachers = new ArrayList<>();

        try {

            sql="select * from teacher where 1=1";

            if(teacher.getTid()!=null&&teacher.getTid()!=""){
                sql=sql+" and tid='"+teacher.getTid()+"'";
            }
            if(teacher.getTsex()!=null&&teacher.getTsex()!=""){
                sql=sql+" and tsex='"+teacher.getTsex()+"'";
            }
            if(teacher.getTbirth()!=null){
                sql=sql+" and tbirth='"+teacher.getTbirth()+"'";
            }
            if(teacher.gettIDnum()!=null&&teacher.gettIDnum()!=""){
                sql=sql+" and tIDnum='"+teacher.gettIDnum()+"'";
            }
            if(teacher.getTrace()!=null&&teacher.getTrace()!=""){
                sql=sql+" and trace='"+teacher.getTrace()+"'";
            }
            if(teacher.getTindate()!=null) {
                sql = sql + " and tindate='" + teacher.getTindate() + "'";
            }
            if(teacher.getMail()!=null&&teacher.getMail()!="") {
                sql = sql + " and mail='" + teacher.getMail() + "'";
            }


            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            teachers = session.createSQLQuery(sql).addEntity(Teacher.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
        if (teachers!= null)
            return teachers;
        else
            return null;
    }
}
