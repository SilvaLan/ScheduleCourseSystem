package courseschesystem.dao;

import courseschesystem.entity.User;

import java.util.List;

/**
 * @Author: zzh
 * @Description: User的DAO接口类
 * @Date: Created in 17:00 2017/3/30
 * @Modified By:
 */
public interface UserDAO {
    boolean add(User user);
    boolean delete(User user);
    boolean update(User user);
    User get(String id);
    List<User> queryUser(User user);
}
