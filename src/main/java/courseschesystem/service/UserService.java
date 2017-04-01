package courseschesystem.service;

import courseschesystem.entity.User;

/**
 * Created by zzh on 2017/3/29.
 */
public interface UserService {

    //传入User对象，校验User对象信息是否正确，返回校验结果
    boolean login(User user);
}
