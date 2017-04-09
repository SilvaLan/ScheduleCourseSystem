package courseschesystem.dao;

import courseschesystem.entity.Arrange;
import db.MyHibernateSessionFactory;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 2:01 2017/4/8
 * @Modified By:
 */
public class ArrangeDAOTest extends TestCase {
    public void testAdd() throws Exception {
        //创建实体类（瞬态对象）
        Arrange arrange = new Arrange();
        arrange.setArid("000003");
        arrange.setCaid("0000000004");
        arrange.setActype("临时活动");
        arrange.setRid("K101");
        arrange.setAcweek(3);
        arrange.setAcnum(4);
        //获得Session实例
        Session session = MyHibernateSessionFactory.getSession();
        Transaction tx = null;
        System.out.println("rid"+arrange.getRid());
        try{
            tx = session.beginTransaction();
            session.save(arrange);
            tx.commit();
        }catch (Exception e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally {
            MyHibernateSessionFactory.closeSession();
        }
    }

    public void testDelete() throws Exception {
        //获得session实例
        Session session = MyHibernateSessionFactory.getSession();
        Transaction tx = null;
        Arrange arrange = (Arrange) session.get(Arrange.class,"000003");
        try
        {
            tx = session.beginTransaction();    //开始一个事务
            session.delete(arrange);               //执行删除
            tx.commit();                        //提交事务
        }catch (Exception e)
        {
            if(tx!=null){
                tx.rollback();         //事务回滚
            }
            e.printStackTrace();
        } finally {
            MyHibernateSessionFactory.closeSession();  //关闭Session
        }
    }

    public void testUpdate() throws Exception {

    }

    public void testQuery() throws Exception {

    }

}