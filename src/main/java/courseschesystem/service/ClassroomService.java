package courseschesystem.service;

import courseschesystem.entity.Classroom;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 10:14 2017/4/8
 * @Modified By:
 */
public interface ClassroomService {
    //查看所有教室的使用情况
    List<Classroom> queryClassroom();

}
