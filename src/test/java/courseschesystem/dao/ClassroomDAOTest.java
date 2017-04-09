package courseschesystem.dao;

import courseschesystem.entity.Classroom;
import db.MyHibernateSessionFactory;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 1:54 2017/4/8
 * @Modified By:
 */
public class ClassroomDAOTest extends TestCase {
    public void testAdd() throws Exception {

        //创建实体类（瞬态对象）
        Classroom classroom = new Classroom();
        classroom.setRid("K101");
        classroom.setRname("科101");
        classroom.setSeatnum(150);
        //获得Session实例
        Session session = MyHibernateSessionFactory.getSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(classroom);
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

}