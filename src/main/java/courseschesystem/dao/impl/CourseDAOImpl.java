package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.dao.CourseDAO;
import courseschesystem.entity.Course;
import courseschesystem.entity.Student;
import db.MyHibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lily
 * @Description:
 * @Date: Created in 11:47 2017/4/1
 * @Modified By:
 */
public class CourseDAOImpl extends BaseHibernateDAO implements CourseDAO{

    @Override
    public boolean add(Course course) {
       return super.add(course);
    }

    @Override
    public boolean delete(Course course) {
        return super.delete(course);
    }

    @Override
    public boolean update(Course course) {
        return super.update(course);
    }

    @Override
    public List<Course> queryCourse(Course course) {
        /**
         * @Author: Lily
         * @Description:
         * @param course
         * @output: return the list of course if querying succeeds,return null if querying fails
         * @Date: Created in 17:23 2017/4/1
         * @Modified By: zzh
         */
        String sql;
        Transaction tx = null;
        List<Course> courses = new ArrayList<>();

        try {

            sql="select * from course where 1=1";

            if(course.getCourseid()!=null&&course.getCourseid()!=""){
                sql=sql+" and courseid='"+course.getCourseid()+"'";
            }
            if(course.getCoursename()!=null&&course.getCoursename()!=""){
                sql=sql+" and =coursename'"+course.getCoursename()+"'";
            }
            if(course.getCredit()>0){
                sql=sql+" and credit='"+course.getCredit()+"'";
            }
            if(course.getTid()!=null&&course.getTid()!=""){
                sql=sql+" and tid='"+course.getTid()+"'";
            }
            if(course.getAid()!=null&&course.getAid()!=""){
                sql=sql+" and aid='"+course.getAid()+"'";
            }
            if(course.getClasshour()>0) {
                sql = sql + " and classhour='" + course.getClasshour() + "'";
            }
            if(course.getExamine()!=null&&course.getExamine()!="") {
                sql = sql + " and examine='" + course.getExamine() + "'";
            }


            Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            courses = session.createSQLQuery(sql).addEntity(Course.class).list();
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.commit();
        } finally {
            if (tx != null) {
                tx = null;
            }
        }
        if (courses!= null)
            return courses;
        else
            return null;
    }

    @Override
    public Course get(String id){
        return (Course)super.get(Course.class,id);
    }


    /**
     * 查询某个学生的课表
     * @param student 根据教师编号tid，在instruction表和course表中查询，得到某个教师的授课表
     * @return 该学生的课表
     */
    public List<Course> findByStudent(Student student){
        List<Course> courses = new ArrayList<>();
        return courses;
    }


    /**
     * 根据课程号cno，查询某门课程的上课时间
     * @param courseid 课程
     * @return 该门课程的上课时间
     */
    public String findCourseTimeByCourseid(String courseid){
        String CourseTime=null;
        return CourseTime;
    }

    public int[] queryCourseweek(String courseid){
        /**
         * @Author: zzh
         * @Description: new一个长度为2的数组，第一个元素存放起始周，第二个元素存放结束周
         * @param courseid
         * @output: 上课起始周和结束周的数组
         * @Date: Created in 19:28 2017/4/6
         * @Modified By:
         */

        return null;
    }
}
