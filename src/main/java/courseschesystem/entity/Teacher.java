package courseschesystem.entity;

import java.util.Date;

/**
 * Created by Lily on 2017/3/31.
 */
public class Teacher {
    private String tid;
    private String tname;
    private String  tsex;
    private Date tbirth;
    private String tIDnum;
    private String trace;
    private Date tindate;
    private String aid;
    private String mail;

    public String getTid() {
        return tid;
    }
    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }
    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Date getTbirth() {
        return tbirth;
    }
    public void setTbirth(Date tbirth) {
        this.tbirth = tbirth;
    }

    public String gettIDnun() {
        return tIDnum;
    }
    public void settIDnun(String tIDnun) {
        this.tIDnum = tIDnun;
    }

    public String getTrace() {
        return trace;
    }
    public void setTrace(String trace) {
        this.trace = trace;
    }

    public Date getTindate() {
        return tindate;
    }
    public void setTindate(Date tindate) {
        this.tindate = tindate;
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

}
