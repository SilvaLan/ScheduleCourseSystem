package courseschesystem.service.impl;

import courseschesystem.dao.ClassroomDAO;
import courseschesystem.dao.impl.ClassroomDAOImpl;
import courseschesystem.entity.Classroom;
import courseschesystem.service.ClassroomService;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 10:03 2017/4/8
 * @Modified By:
 */
public class ClassroomServiceImpl implements ClassroomService {
    public List<Classroom> queryClassroom(){
        ClassroomDAO classroomDAO = new ClassroomDAOImpl();
        return classroomDAO.queryClassroom();
    }

}
