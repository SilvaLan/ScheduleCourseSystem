package courseschesystem.dao.impl;

import courseschesystem.dao.SelectionDAO;
import courseschesystem.entity.Course;
import courseschesystem.entity.Selection;
import courseschesystem.entity.Student;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lily
 * @Description:
 * @Date: Created in 11:11 2017/4/3
 * @Modified By:
 */
public class SelectionDAOImpl implements SelectionDAO{
    @Override
    public boolean addSelection(Selection selection) {
        /**
         * @Author: Lily
         * @Description: 实现SelectionDAO抽象类中的addSelection方法，添加Selection
         * @param selection
         * @output: return true if adding succeeds,return false if adding failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By: zzh
         */
        String sql="insert into selection values("+selection.getSid()+",'"+
                selection.getCourseid()+"'," +
                selection.getAid()+ ",'"+
                selection.getCoursetype()+"'," +
                selection.getCnum()+"," +
                selection.getLnum()+",'" +
                selection.getRid()+"','" +
                selection.getCoursetime()+"' )";
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

    @Override
    public boolean deleteSelection(Selection selection) {
        /**
         * @Author: Lily
         * @Description: 实现SelectionDAO抽象类中的deleteSelection方法，删除Selection
         * @param selection
         * @output: return true if deleting succeeds,return false if deleting failed
         * @Date: Created in 17:17 2017/4/1
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try
        {
            sql="delete from selection where sid='"+selection.getSid()+"'";
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

    @Override
    public boolean updateSelection(Selection selection) {
        /**
         * @Author: Lily
         * @Description: 实现SelectionDAO抽象类中的updateSelection方法，修改Selection
         * @param selection
         * @output: return true if updating succeeds,return false if updating failed
         * @Date: Created in 17:18 2017/4/1
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try {

            sql = "update selection set courseid='" + selection.getCourseid() +
                    "', aid='" +selection.getAid()+
                    "',coursetype='" + selection.getCoursetype()+
                    "',cnum=" + selection.getCnum() +
                    ",lnum=" + selection.getLnum() +
                    ", rid='" + selection.getRid() +
                    "',coursetime='" + selection.getCoursetime() +
                    "' where sid=" + selection.getSid()+
                    "";
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

    @Override
    public List<Selection> querySelection(Selection selection) {

        /**
         * @Author: Lily
         * @Description:
         * @param selection
         * @output: return the list of course if querying succeeds,return null if querying fails
         * @Date: Created in 17:23 2017/4/1
         * @Modified By: zzh
         */
        String sql;
        Transaction tx = null;
        List<Selection> selections = new ArrayList<>();

        try {

            sql="select * from selection where 1=1";

            if(selection.getSid()!=null&&selection.getSid()!=""){
                sql=sql+" and sid='"+selection.getSid()+"'";
            }
            if(selection.getCourseid()!=null&&selection.getCourseid()!=""){
                sql=sql+" and =courseid'"+selection.getCourseid()+"'";
            }
            if(selection.getAid()!=null&&selection.getAid()!=""){
                sql=sql+" and aid='"+selection.getAid()+"'";
            }
            if(selection.getCoursetype()!=null&&selection.getCoursetype()!=""){
                sql=sql+" and coursetype='"+selection.getCoursetype()+"'";
            }
            if(selection.getCnum()>0){
                sql=sql+" and cnum="+selection.getCnum()+"";
            }
            if(selection.getLnum()>0) {
                sql = sql + " and lnum=" +selection.getLnum() + "";
            }
            if(selection.getRid()!=null&&selection.getRid()!=""){
                sql=sql+" and rid='"+selection.getRid()+"'";
            }


            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            selections = session.createSQLQuery(sql).addEntity(Selection.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
        if (selections!= null)
            return selections;
        else
            return null;
    }
}
