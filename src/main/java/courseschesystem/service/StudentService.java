package courseschesystem.service;

/**
 * @Author: zzh
 * @Description: 面向学生用户的 相关业务方法 的接口类
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public interface StudentService {
    //根据关键字类型和关键字内容，返回满足条件的学生数量
    int getStudentNum(String keyType, String key);
}
