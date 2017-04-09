package courseschesystem.dao;

import courseschesystem.entity.Arrange;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:05 2017/4/6
 * @Modified By:
 */
public interface ArrangeDAO {
    boolean add(Arrange arrange);
    boolean delete(Arrange arrange);
    boolean update(Arrange arrange);
    Arrange get(String id);

    List<Arrange> queryArrangeByDate(int week, int day);

    List<Arrange> queryArrangeByRwc(String rid,int week,int courseIndex);

    List<Arrange> queryArrangeByCwc(String courseid,int week,int courseIndex);
}
