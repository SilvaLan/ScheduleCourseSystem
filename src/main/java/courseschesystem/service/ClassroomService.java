package courseschesystem.service;

import courseschesystem.entity.Classroom;

import java.util.Date;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public interface ClassroomService {

    //根据日期查询教室使用情况
    List<Classroom> queryClassroomByDate(Date date);
}
