package courseschesystem.entity;

import java.util.Date;

/**
 * Created by Lily on 2017/3/31.
 */
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

    public String getStuid() {
        return stuid;
    }
    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public Date getStubirth() {
        return stubirth;
    }

    public void setStubirth(Date stubirth) {
        this.stubirth = stubirth;
    }

    public String getStuIDnum() {
        return stuIDnum;
    }

    public void setStuIDnum(String stuIDnum) {
        this.stuIDnum = stuIDnum;
    }

    public String getSturace() {
        return sturace;
    }

    public void setSturace(String sturace) {
        this.sturace = sturace;
    }

    public Date getStuindate() {
        return stuindate;
    }

    public void setStuindate(Date stuindate) {
        this.stuindate = stuindate;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

}
