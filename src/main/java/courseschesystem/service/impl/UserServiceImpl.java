package courseschesystem.service.impl;

import courseschesystem.dao.UserDAO;
import courseschesystem.dao.impl.UserDAOImpl;
import courseschesystem.entity.User;
import courseschesystem.service.UserService;

import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class UserServiceImpl implements UserService{


    public boolean login(User user){
        /**
         * @Author: zzh
         * @Description: 传入User对象，校验User对象信息是否正确，返回校验结果
         * @param user
         * @output: if user exists,return true, else return false
         * @Date: Created in 12:29 2017/4/1
         * @Modified By:
         */

        UserDAO userDAO = new UserDAOImpl();
        List<User> users = userDAO.queryUser(user);
        return users != null;
    }
}
