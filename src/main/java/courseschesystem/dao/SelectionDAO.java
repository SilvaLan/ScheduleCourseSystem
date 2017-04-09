package courseschesystem.dao;

import courseschesystem.entity.Selection;

import java.util.List;

/**
 * @Author: Lily
 * @Description:Selection的接口类
 * @Date: Created in 11:53 2017/4/1
 * @Modified By:
 */
public interface SelectionDAO {
    boolean add(Selection selection);
    boolean delete(Selection selection);
    boolean update(Selection selection);
    Selection get(String id);
    List<Selection> querySelection(Selection selection);

}
