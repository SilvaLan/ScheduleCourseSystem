import courseschesystem.entity.User;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 23:26 2017/4/7
 * @Modified By:
 */
public class TestAddUser {
    public static void main(String[] args){
        //TODO Auto-generated method stub
        new TestAddUser().addUser();
    }
    public void addUser(){
        //创建实体类（瞬态对象）
        User user = new User();
        user.setUid("2014014001");
        user.setUpwd("123456");
        user.setUtype("学生");
        //获得Session实例
        Session session = MyHibernateSessionFactory.getSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(user);
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
