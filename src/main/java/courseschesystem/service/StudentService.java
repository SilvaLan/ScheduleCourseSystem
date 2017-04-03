package courseschesystem.service;

/**
 * Created by zzh on 2017/3/29.
 */
public interface StudentService {
    //根据关键字类型和关键字内容，返回满足条件的学生数量
    int getStudentNum(String keyType, String key);
}
