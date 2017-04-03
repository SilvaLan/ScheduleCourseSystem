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

    public String queryClassroomByDate(){
        /**
         * @Author: zzh
         * @Description: 查询时间为date的教室使用情况，通过 request.getParameter("date") 获取jsp页面的date
         * @output: return "queryClassroom_success" or "queryClassroom_failure"
         * @Date: Created in 12:15 2017/4/1
         * @Modified By:
         */

        return "";
    }


}
