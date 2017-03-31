package courseschesystem.dao;

import courseschesystem.entity.User;

/**
 * @Author: zzh
 * @Description: User的DAO接口类
 * @Date: Created in 17:00 2017/3/30
 * @Modified By:
 */
public interface UserDAO {
    /**
     * @Author: zzh
     * @Description:
     * @Date: Created in ${TIME} ${DATE}
     * @Modified By:
     */
    public boolean addUser(User user);

    /**
     *
     * @param user
     * @return
     */
    public boolean deleteUser(User user);

    /**
     *
     * @param user
     * @return
     */
    public boolean updateUser(User user);

    /**
     *
     * @param user
     * @return
     */
    public boolean queryUser(User user);
}
