package courseschesystem.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 21:15 2017/4/7
 * @Modified By:
 */
@Entity
@Table(name = "class", schema = "manage_system", catalog = "")
public class Clazz {
    private String classid;
    private String classname;
    private int stunum;
    private String aid;
    private String majorid;



    @Id
    @Column(name = "classid")
    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    @Basic
    @Column(name = "classname")
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Basic
    @Column(name = "stunum")
    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clazz clazz = (Clazz) o;

        if (stunum != clazz.stunum) return false;
        if (classid != null ? !classid.equals(clazz.classid) : clazz.classid != null) return false;
        return classname != null ? classname.equals(clazz.classname) : clazz.classname == null;
    }

    @Override
    public int hashCode() {
        int result = classid != null ? classid.hashCode() : 0;
        result = 31 * result + (classname != null ? classname.hashCode() : 0);
        result = 31 * result + stunum;
        return result;
    }

    @Basic
    @Column(name = "aid")
    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "majorid")
    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
    }

}
