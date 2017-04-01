
package courseschesystem.dao.impl;

import courseschesystem.dao.UserDAO;
import courseschesystem.entity.User;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2017/3/31
 * */
public class UserDAOImpl implements UserDAO {

    public boolean addUser(User user){
        /**
         * @Author: Lily
         * @Description: 实现UserDAO抽象类中的addUser方法，添加User
         * @param user
         * @output: return true if adding succeeds,return false if adding failed
         * @Date: Created in 17:17 2017/3/30
         * @Modified By:
         */
        String sql = "insert into User values('"+user.getUid()+"','"+user.getUpwd()+"','"+user.getUtype()+"')";
        Transaction tx;

        Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        // 执行sql语句
        session.createSQLQuery(sql).executeUpdate();
        // 提交事务
        tx.commit();
        // 事务清空
        if (tx != null) {
            tx = null;
        }
        return true;
    }

    public boolean deleteUser(User user){
        /**
         * @Author: Lily
         * @Description: 实现UserDAO抽象类中的deleteUser方法，删除User
         * @param user
         * @output: return true if deleting succeeds,return false if deleting failed
         * @Date: Created in 17:17 2017/3/30
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try
        {
            sql ="delete from User where uid='"+user.getUid()+"'";
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

    public boolean updateUser(User user){
        /**
         * @Author: Lily
         * @Description: 实现UserDAO抽象类中的updateUser方法，修改User
         * @param user
         * @output: return true if updating succeeds,return false if updating failed
         * @Date: Created in 17:18 2017/3/30
         * @Modified By:
         */
        String sql;
        Transaction tx = null;
        try {
            sql = "update students set upwd='" + user.getUpwd() + "',utype='" + user.getUtype() + "' where uid='" + user.getUid() + "'";
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

    public List<User> queryUser(User user){
        /**
         * @Author: Lily
         * @Description: return the list of users if querying succeeds,return null if querying fails
         * @param user
         * @output: return true if querying succeeds,return false if querying fails
         * @Date: Created in 17:23 2017/3/30
         * @Modified By:
         */
        String sql ="select * from User where uid='"+user.getUid()+"'";
        Transaction tx;

        Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        List<User> users = new ArrayList<>();
        users = session.createSQLQuery(sql).addEntity(User.class).list();
        //提交事务
        tx.commit();
        // 事务清空
        if (tx != null) {
            tx = null;
        }
        if (users != null)
            return users;
        else
            return null;
    }
}
