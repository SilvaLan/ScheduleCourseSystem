
package courseschesystem.dao.impl;

import courseschesystem.dao.UserDAO;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.awt.print.Book;
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
         * @Modified By: zzh
         */
        String sql = "insert into user values('"+user.getUid()+"','"+user.getUpwd()+"','"+user.getUtype()+"')";
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
         * @Modified By: zzh
         */
        String sql;
        Transaction tx = null;
        try
        {
            sql ="delete from user where uid='"+user.getUid()+"'";
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
         * @Modified By: zzh
         */
        String sql;
        Transaction tx = null;
        try {
            sql = "update user set upwd='" + user.getUpwd() + "',utype='" + user.getUtype() + "' where uid='" + user.getUid() + "'";
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
         * @Modified By: zzh
         */

        String sql;
        Transaction tx = null;
        List<User> users = new ArrayList<>();
        try {

            sql="select * from user where 1=1";

            if(user.getUid()!=null&&user.getUid()!=""){
                sql=sql+" and uid='"+user.getUid()+"'";
            }
            if(user.getUpwd()!=null&&user.getUpwd()!=""){
                sql=sql+" and upwd='"+user.getUpwd()+"'";
            }
            if(user.getUtype()!=null&&user.getUtype()!=""){
                sql=sql+" and utype='"+user.getUtype()+"'";
            }

            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            users = session.createSQLQuery(sql).addEntity(Book.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
        if (users != null)
            return users;
        else
            return null;
    }
}
