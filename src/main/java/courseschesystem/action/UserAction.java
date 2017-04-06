package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.service.UserService;
import courseschesystem.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzh on 2017/3/29.
 */
public class UserAction extends SuperAction implements ModelDriven<List<User>>{

    private static final long serialVersionUID = 1L;
    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getModel() {
        return this.users;
    }

    public String login(String uid, String upwd,String utype){
        /**
         * @Author: zzh
         * @Description: 根据用户名、密码、用户类型，实现登录校验
         * @param uid
         * @param upwd
         * @param utype
         * @output: return "login_success" if success, or return "login_failure"
         * @Date: Created in 12:26 2017/4/1
         * @Modified By:
         */
        User user = new User(uid,upwd,utype);
        UserService userService = new UserServiceImpl();
        if(userService.login(user)){
            /*
            如果user存在，则根据user的类型，跳转到相应的页面
             */
            String type = user.getUtype();
            if(type=="student")
                return "login_success_student";
            if(type=="teacher")
                return "login_success_teacher";
            if(type=="manager")
                return "login_success_manager";
            else
                return "login_failure";
        }else{
            return "login_failure";
        }
    }


}




