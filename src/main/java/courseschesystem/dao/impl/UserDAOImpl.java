
package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.dao.UserDAO;
import courseschesystem.entity.User;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lily on 2017/3/31
 * */
public class UserDAOImpl extends BaseHibernateDAO implements UserDAO {

    //添加数据
    @Override
    public boolean add(User user){
        return super.add(user);
    }

    //删除数据
    @Override
    public boolean delete(User user){
        return super.delete(user);
    }

    //修改数据
    @Override
    public boolean update(User user){
        return super.update(user);
    }

    //加载数据
    public User get(String id){
        return (User) super.get(User.class,id);
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
