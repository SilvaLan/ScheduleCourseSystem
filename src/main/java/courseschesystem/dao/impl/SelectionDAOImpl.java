package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.dao.SelectionDAO;
import courseschesystem.entity.Selection;
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
public class SelectionDAOImpl extends BaseHibernateDAO implements SelectionDAO{
    @Override
    public boolean add(Selection selection) {
        return super.add(selection);
    }

    @Override
    public boolean delete(Selection selection) {
        return super.delete(selection);
    }

    @Override
    public boolean update(Selection selection){
        return super.update(selection);
    }

    @Override
    public Selection get(String id){
        return (Selection)super.get(Selection.class,id);
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

            if(selection.getCourseid()!=null&&selection.getCourseid()!=""){
                sql=sql+" and courseid='"+selection.getCourseid()+"'";
            }
            if(selection.getStuid()!=null&&selection.getStuid()!=""){
                sql=sql+" and =stuid'"+selection.getStuid()+"'";
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
