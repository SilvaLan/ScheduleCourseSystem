package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;
import courseschesystem.entity.User;

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
         * @param upwd
         * @param utype
         * @output:
         * @Date: Created in 12:26 2017/4/1
         * @Modified By:
         */

        return "";
    }


}




