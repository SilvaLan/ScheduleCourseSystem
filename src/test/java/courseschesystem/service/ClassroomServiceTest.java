package courseschesystem.service;

import courseschesystem.entity.Classroom;
import courseschesystem.service.impl.ClassroomServiceImpl;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 11:31 2017/4/8
 * @Modified By:
 */
public class ClassroomServiceTest extends TestCase {

    public void testQueryClassroom() throws Exception {

        List<Classroom> classrooms = new ArrayList<>();
        ClassroomService classroomService = new ClassroomServiceImpl();
        classrooms=classroomService.queryClassroom();

        Iterator iterator = classrooms.iterator();
        while(iterator.hasNext()){
            Classroom classroom = (Classroom)iterator.next();
            System.out.println(classroom.getRid()+" "+classroom.getRname()+" "+classroom.getSeatnum());
        }
    }

}