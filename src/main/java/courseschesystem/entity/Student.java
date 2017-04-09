package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 21:16 2017/4/7
 * @Modified By:
 */
@Entity
public class Student {
    private String stuid;
    private String stuname;
    private String stusex;
    private Date stubirth;
    private String stuIDnum;
    private String sturace;
    private Date stuindate;
    private String classid;
    private String majorid;
    private String aid;
    private String mail;
    private String edu;

    @Id
    @Column(name = "stuid")
    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    @Basic
    @Column(name = "stuname")
    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    @Basic
    @Column(name = "stusex")
    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    @Basic
    @Column(name = "stubirth")
    public Date getStubirth() {
        return stubirth;
    }

    public void setStubirth(Date stubirth) {
        this.stubirth = stubirth;
    }

    @Basic
    @Column(name = "stuIDnum")
    public String getStuIDnum() {
        return stuIDnum;
    }

    public void setStuIDnum(String stuIDnum) {
        this.stuIDnum = stuIDnum;
    }

    @Basic
    @Column(name = "sturace")
    public String getSturace() {
        return sturace;
    }

    public void setSturace(String sturace) {
        this.sturace = sturace;
    }

    @Basic
    @Column(name = "stuindate")
    public Date getStuindate() {
        return stuindate;
    }

    public void setStuindate(Date stuindate) {
        this.stuindate = stuindate;
    }

    @Basic
    @Column(name = "classid")
    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    @Basic
    @Column(name = "majorid")
    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
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
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "edu")
    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (stuid != null ? !stuid.equals(student.stuid) : student.stuid != null) return false;
        if (stuname != null ? !stuname.equals(student.stuname) : student.stuname != null) return false;
        if (stusex != null ? !stusex.equals(student.stusex) : student.stusex != null) return false;
        if (stubirth != null ? !stubirth.equals(student.stubirth) : student.stubirth != null) return false;
        if (stuIDnum != null ? !stuIDnum.equals(student.stuIDnum) : student.stuIDnum != null) return false;
        if (sturace != null ? !sturace.equals(student.sturace) : student.sturace != null) return false;
        if (stuindate != null ? !stuindate.equals(student.stuindate) : student.stuindate != null) return false;
        if (classid != null ? !classid.equals(student.classid) : student.classid != null) return false;
        if (majorid != null ? !majorid.equals(student.majorid) : student.majorid != null) return false;
        if (aid != null ? !aid.equals(student.aid) : student.aid != null) return false;
        if (mail != null ? !mail.equals(student.mail) : student.mail != null) return false;
        return edu != null ? edu.equals(student.edu) : student.edu == null;
    }

    @Override
    public int hashCode() {
        int result = stuid != null ? stuid.hashCode() : 0;
        result = 31 * result + (stuname != null ? stuname.hashCode() : 0);
        result = 31 * result + (stusex != null ? stusex.hashCode() : 0);
        result = 31 * result + (stubirth != null ? stubirth.hashCode() : 0);
        result = 31 * result + (stuIDnum != null ? stuIDnum.hashCode() : 0);
        result = 31 * result + (sturace != null ? sturace.hashCode() : 0);
        result = 31 * result + (stuindate != null ? stuindate.hashCode() : 0);
        result = 31 * result + (classid != null ? classid.hashCode() : 0);
        result = 31 * result + (majorid != null ? majorid.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (edu != null ? edu.hashCode() : 0);
        return result;
    }
}
