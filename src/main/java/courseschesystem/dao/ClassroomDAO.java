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
    boolean addClassroom(Classroom classroom);
    boolean deleteClassroom(Classroom classroom);
    boolean updateClassroom(Classroom classroom);
    List<Classroom> queryClassroom(Classroom classroom);
    List<Classroom> queryClassroomByDate(Date date);

}
