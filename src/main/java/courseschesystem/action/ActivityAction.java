package courseschesystem.action;

import com.opensymphony.xwork2.ModelDriven;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:11 2017/4/6
 * @Modified By:
 */
public class ActivityAction extends SuperAction implements ModelDriven<List<Activity>>{
    private static final long serialVersionUID = 1L;
    private List<Activity> activities = new ArrayList<>();
    private HttpServletRequest request;
    @Override
    public List<Activity> getModel() {
        return this.activities;
    }
}
