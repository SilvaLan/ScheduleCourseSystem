package courseschesystem.dao.impl;

import courseschesystem.dao.ArrangeDAO;
import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.entity.Arrange;
import db.MyHibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:06 2017/4/6
 * @Modified By:
 */
public class ArrangeDAOImpl extends BaseHibernateDAO implements ArrangeDAO{

    @Override
    public boolean add(Arrange arrange){
        return super.add(arrange);
    }

    @Override
    public boolean delete(Arrange arrange){
        return super.delete(arrange);
    }

    @Override
    public boolean update(Arrange arrange){
        return super.update(arrange);
    }

    @Override
    public Arrange get(String id){
        return (Arrange)super.get(Arrange.class,id);
    }

    public List<Arrange> queryArrangeByDate(int week ,int day){

        List<Arrange> arranges = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql = "select new courseschesystem.entity.Arrange(arrange.arid, arrange.caid, arrange.actype, arrange.acweek, arrange.acnum, arrange.rid)" +
                "from Arrange arrange where arrange.acweek = ? and arrange.acnum = ? ";
        Query query = session.createQuery(hql);
        query.setInteger(0,week);
        query.setInteger(1,day);
        List list = query.list();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            arranges.add((Arrange)iterator.next());
        }
        return arranges;
    }

    public List<Arrange> queryArrangeByRwc(String rid,int week,int courseIndex){
        List<Arrange> arranges = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql = "select new courseschesystem.entity.Arrange(arrange.arid, arrange.caid, arrange.actype, arrange.acweek, arrange.acnum, arrange.rid)" +
                "from Arrange arrange where arrange.rid = ? and arrange.acweek = ? and arrange.acnum = ? ";
        Query query = session.createQuery(hql);
        query.setString(0,rid);
        query.setInteger(1,week);
        query.setInteger(2,courseIndex);
        List list = query.list();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            arranges.add((Arrange)iterator.next());
        }
        return arranges;
    }

    public List<Arrange> queryArrangeByCwc(String courseid,int week,int courseIndex){
        List<Arrange> arranges = new ArrayList<>();
        Session session = MyHibernateSessionFactory.getSession();
        String hql = "select new courseschesystem.entity.Arrange(arrange.arid, arrange.caid, arrange.actype, arrange.acweek, arrange.acnum, arrange.rid)" +
                "from Arrange arrange where arrange.caid = ? and arrange.acweek = ? and arrange.acnum = ? ";
        Query query = session.createQuery(hql);
        query.setString(0,courseid);
        query.setInteger(1,week);
        query.setInteger(2,courseIndex);
        List list = query.list();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            arranges.add((Arrange)iterator.next());
        }
        return arranges;
    }
}
