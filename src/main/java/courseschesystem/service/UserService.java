package courseschesystem.service;

import courseschesystem.entity.User;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public interface UserService {

    //传入User对象，校验User对象信息是否正确，返回校验结果
    boolean login(User user);
}
