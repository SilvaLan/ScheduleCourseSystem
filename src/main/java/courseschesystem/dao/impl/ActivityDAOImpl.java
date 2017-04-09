package courseschesystem.dao.impl;

import courseschesystem.dao.ActivityDAO;
import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.entity.Activity;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 19:21 2017/4/5
 * @Modified By:
 */
public class ActivityDAOImpl extends BaseHibernateDAO implements ActivityDAO{


    @Override
    public boolean add(Activity activity){
        return super.add(activity);
    }

    @Override
    public boolean delete(Activity activity){
        return  super.delete(activity);
    }

    @Override
    public boolean update(Activity activity){
        return  super.update(activity);
    }

    @Override
    public Activity get(String id){
        return (Activity)super.get(Activity.class,id);
    }

    public List<Activity> query(Activity activity){
        /**
         * @Author:
         * @Description: 查找
         * @param activity
         * @output:
         * @Date: Created in 19:27 2017/4/5
         * @Modified By:
         */

        return null;
    }

}
