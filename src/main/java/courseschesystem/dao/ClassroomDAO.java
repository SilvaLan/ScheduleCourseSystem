package courseschesystem.dao;

import courseschesystem.entity.Classroom;

import java.util.Date;
import java.util.List;

/**
 * @Author: Lily
 * @Description: Classroom的接口类
 * @Date: Created in 12"30 2017/4/1
 * @Modified By:
 */
public interface ClassroomDAO {
    boolean add(Classroom classroom);
    boolean delete(Classroom classroom);
    boolean update(Classroom classroom);
    Classroom get(String id);

    //分页查看所有教室使用情况
    List<Classroom> queryClassroom();
    List<Classroom> queryClassroomByDate(Date date);

}
