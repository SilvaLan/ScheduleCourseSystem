package courseschesystem.dao;

import java.util.List;

/**
 * @Author: zzh
 * @Description: User的DAO接口类
 * @Date: Created in 17:00 2017/3/30
 * @Modified By:
 */
public interface UserDAO {
    boolean addUser(User user);
    boolean deleteUser(User user);
    boolean updateUser(User user);
    List<User> queryUser(User user);
}
