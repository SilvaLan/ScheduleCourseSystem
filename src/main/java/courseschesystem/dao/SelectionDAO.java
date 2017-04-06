package courseschesystem.dao;

import java.util.List;

/**
 * @Author: Lily
 * @Description:Selection的接口类
 * @Date: Created in 11:53 2017/4/1
 * @Modified By:
 */
public interface SelectionDAO {
    boolean addSelection(Selection selection);
    boolean deleteSelection(Selection selection);
    boolean updateSelection(Selection selection);
    List<Selection> querySelection(Selection selection);

}
