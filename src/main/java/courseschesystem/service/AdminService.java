package courseschesystem.service;

import java.util.Date;
import java.util.List;

/**
 * @Author: zzh
 * @Description: 面向教务系统管理员的 相关业务方法 的接口类
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public interface AdminService {
    List<Classroom> queryClassroomByDate(Date date);
}
