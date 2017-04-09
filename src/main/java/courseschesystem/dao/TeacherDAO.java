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
    boolean add(Teacher teacher);
    boolean delete(Teacher teacher);
    boolean update(Teacher teacher);
    Teacher get(String id);
    List<Teacher> queryTeacher(Teacher teacher);

}
