package courseschesystem.entity;

import java.util.Date;

/**
 * Created by Lily on 2017/3/31.
 */
public class Teacher {
    String tid;
    String tname;
    String  tsex;
    Date tbirth;
    String tIDnun;
    String trace;
    Date tindate;
    String aid;
    String mail;

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
        return tIDnun;
    }
    public void settIDnun(String tIDnun) {
        this.tIDnun = tIDnun;
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
