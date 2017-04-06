package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 20:12 2017/4/6
 * @Modified By:
 */
@Entity
public class Course {
    private String courseid;
    private String coursename;
    private double credit;
    private int classhour;
    private String examine;
    private String coursetype;
    private String rid;
    private int lnum;
    private int cnum;
    private int bweek;
    private int eweek;
    private String evaluate;
    private String coursetime;

    @Id
    @Column(name = "courseid")
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    @Basic
    @Column(name = "coursename")
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Basic
    @Column(name = "credit")
    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "classhour")
    public int getClasshour() {
        return classhour;
    }

    public void setClasshour(int classhour) {
        this.classhour = classhour;
    }

    @Basic
    @Column(name = "examine")
    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    @Basic
    @Column(name = "coursetype")
    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }

    @Basic
    @Column(name = "rid")
    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "lnum")
    public int getLnum() {
        return lnum;
    }

    public void setLnum(int lnum) {
        this.lnum = lnum;
    }

    @Basic
    @Column(name = "cnum")
    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    @Basic
    @Column(name = "bweek")
    public int getBweek() {
        return bweek;
    }

    public void setBweek(int bweek) {
        this.bweek = bweek;
    }

    @Basic
    @Column(name = "eweek")
    public int getEweek() {
        return eweek;
    }

    public void setEweek(int eweek) {
        this.eweek = eweek;
    }

    @Basic
    @Column(name = "evaluate")
    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    @Basic
    @Column(name = "coursetime")
    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (Double.compare(course.credit, credit) != 0) return false;
        if (classhour != course.classhour) return false;
        if (lnum != course.lnum) return false;
        if (cnum != course.cnum) return false;
        if (bweek != course.bweek) return false;
        if (eweek != course.eweek) return false;
        if (courseid != null ? !courseid.equals(course.courseid) : course.courseid != null) return false;
        if (coursename != null ? !coursename.equals(course.coursename) : course.coursename != null) return false;
        if (examine != null ? !examine.equals(course.examine) : course.examine != null) return false;
        if (coursetype != null ? !coursetype.equals(course.coursetype) : course.coursetype != null) return false;
        if (rid != null ? !rid.equals(course.rid) : course.rid != null) return false;
        if (evaluate != null ? !evaluate.equals(course.evaluate) : course.evaluate != null) return false;
        return coursetime != null ? coursetime.equals(course.coursetime) : course.coursetime == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = courseid != null ? courseid.hashCode() : 0;
        result = 31 * result + (coursename != null ? coursename.hashCode() : 0);
        temp = Double.doubleToLongBits(credit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + classhour;
        result = 31 * result + (examine != null ? examine.hashCode() : 0);
        result = 31 * result + (coursetype != null ? coursetype.hashCode() : 0);
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        result = 31 * result + lnum;
        result = 31 * result + cnum;
        result = 31 * result + bweek;
        result = 31 * result + eweek;
        result = 31 * result + (evaluate != null ? evaluate.hashCode() : 0);
        result = 31 * result + (coursetime != null ? coursetime.hashCode() : 0);
        return result;
    }
}
