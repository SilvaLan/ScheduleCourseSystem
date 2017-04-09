package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.dao.ClassroomDAO;
import courseschesystem.entity.Classroom;
import db.MyHibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lily on 2017/3/29.
 */
public class ClassroomDAOImpl extends BaseHibernateDAO implements ClassroomDAO {
    public boolean add(Classroom classroom) {
        return super.add(classroom);
    }

    public boolean delete(Classroom classroom) {
        return super.delete(classroom);
    }

    public boolean update(Classroom classroom) {
        return super.update(classroom);
    }
    @Override
    public Classroom get(String id){
        return (Classroom)super.get(Classroom.class,id);
    }

    public List<Classroom> queryClassroom() {
        List<Classroom> classrooms = new ArrayList<>();
        //获取session
        Session session = MyHibernateSessionFactory.getSession();
        //编写hql语句
        String hql = "from Classroom";
        //创建Query对象
        Query query = session.createQuery(hql);
        //执行查询，获得结果
        List list = query.list();
        //遍历查找结果
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            classrooms.add((Classroom)iterator.next());
        }
        return classrooms;
    }

    /**
     * 查询某时间段教室的使用情况
     * @param date 日期
     * @return 返回该时间段内教室的使用情况
     */
    public List<Classroom> queryClassroomByDate(Date date){
        List<Classroom> classrooms = new ArrayList<>();

        return classrooms;
    }
}
