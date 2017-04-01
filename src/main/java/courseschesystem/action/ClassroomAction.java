package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Classroom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class ClassroomAction extends SuperAction implements ModelDriven<List<Classroom>>{

    private static final long serialVersionUID = 1L;
    private List<Classroom> classrooms = new ArrayList<>();

    @Override
    public List<Classroom> getModel() {
        return this.classrooms;
    }

    public String queryClassroom(String date){
        /**
         * @Author: zzh
         * @Description: 输入为当前系统日期 date，查询当天教室使用情况
         * @param date
         * @output: return "queryClassroom_success" or "queryClassroom_failure"
         * @Date: Created in 12:15 2017/4/1
         * @Modified By:
         */

        return "";
    }


}
