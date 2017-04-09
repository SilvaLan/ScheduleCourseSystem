package courseschesystem.dao;

import courseschesystem.entity.Activity;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 19:21 2017/4/5
 * @Modified By:
 */
public interface ActivityDAO {
    boolean add(Activity activity);
    boolean delete(Activity activity);
    boolean update(Activity activity);
    Activity get(String id);

    List<Activity> query(Activity activity);
}
