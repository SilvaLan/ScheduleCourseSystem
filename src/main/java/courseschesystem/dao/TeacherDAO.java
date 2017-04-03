package courseschesystem.dao;

import courseschesystem.entity.Teacher;

import java.util.List;

/**
 * @Author: Lily
 * @Description: Teacher的接口类
 * @Date: Created in 10:46 2017/4/1
 * @Modified By:
 */
public interface TeacherDAO {
    boolean addTeacher(Teacher teacher);
    boolean deleteTeacher(Teacher teacher);
    boolean updateTeacher(Teacher teacher);
    List<Teacher> queryTeacher(Teacher teacher);

}
