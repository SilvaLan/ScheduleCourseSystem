package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.Classroom;
import courseschesystem.service.AdminService;
import courseschesystem.service.ClassroomService;
import courseschesystem.service.impl.AdminServiceImpl;
import courseschesystem.service.impl.ClassroomServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ClassroomAction extends SuperAction implements ModelDriven<List<Classroom>>{

    private static final long serialVersionUID = 1L;
    private List<Classroom> classrooms = new ArrayList<>();
    private HttpServletRequest request;

    @Override
    public List<Classroom> getModel() {
        return this.classrooms;
    }

    //查询所有教室信息
    public String queryClassroom(){
        ClassroomService classroomService = new ClassroomServiceImpl();
        classrooms = classroomService.queryClassroom();

        System.out.println("classroom number = " + classrooms.size());

        session.setAttribute("classrooms",classrooms);

        return "queryClassroom_success";
    }

    //查询教室使用情况
    public String queryClassroomByDate() {
        String roomData_String = request.getParameter("data");   //获取时间data,类型String
        if (roomData_String != null) {
            Date roomData_Date = new Date(roomData_String);
            AdminService adminService = new AdminServiceImpl();  //获取AdminServiceImpl实例
            classrooms = adminService.queryClassroomByDate(roomData_Date);       //调用queryClassroomByDate获取教室信息并存储在classrooms中
            if (classrooms != null) {
                HttpSession session = request.getSession();
                session.setAttribute("List_ClassRoom", classrooms);              //向jsp页面发送classrooms
                return "queryClassroom_success";                            //返回"queryClassroom_success"，跳转到指定页面
            } else {
                return "queryClassroom_failure";            //classrooms为空，跳转到失败页面
            }
        } else {
            return "queryClassroom_failure";            //未成功获取date，跳转到失败页面
        }

    }
}