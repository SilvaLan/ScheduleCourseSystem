package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 20:12 2017/4/6
 * @Modified By:
 */
@Entity
public class Teacher {
    private String tid;
    private String tname;
    private String tsex;
    private Date tbirth;
    private String tIDnum;
    private String trace;
    private Date tindate;
    private String mail;

    @Id
    @Column(name = "tid")
    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "tname")
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Basic
    @Column(name = "tsex")
    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    @Basic
    @Column(name = "tbirth")
    public Date getTbirth() {
        return tbirth;
    }

    public void setTbirth(Date tbirth) {
        this.tbirth = tbirth;
    }

    @Basic
    @Column(name = "tIDnum")
    public String gettIDnum() {
        return tIDnum;
    }

    public void settIDnum(String tIDnum) {
        this.tIDnum = tIDnum;
    }

    @Basic
    @Column(name = "trace")
    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Basic
    @Column(name = "tindate")
    public Date getTindate() {
        return tindate;
    }

    public void setTindate(Date tindate) {
        this.tindate = tindate;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (tid != null ? !tid.equals(teacher.tid) : teacher.tid != null) return false;
        if (tname != null ? !tname.equals(teacher.tname) : teacher.tname != null) return false;
        if (tsex != null ? !tsex.equals(teacher.tsex) : teacher.tsex != null) return false;
        if (tbirth != null ? !tbirth.equals(teacher.tbirth) : teacher.tbirth != null) return false;
        if (tIDnum != null ? !tIDnum.equals(teacher.tIDnum) : teacher.tIDnum != null) return false;
        if (trace != null ? !trace.equals(teacher.trace) : teacher.trace != null) return false;
        if (tindate != null ? !tindate.equals(teacher.tindate) : teacher.tindate != null) return false;
        return mail != null ? mail.equals(teacher.mail) : teacher.mail == null;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (tname != null ? tname.hashCode() : 0);
        result = 31 * result + (tsex != null ? tsex.hashCode() : 0);
        result = 31 * result + (tbirth != null ? tbirth.hashCode() : 0);
        result = 31 * result + (tIDnum != null ? tIDnum.hashCode() : 0);
        result = 31 * result + (trace != null ? trace.hashCode() : 0);
        result = 31 * result + (tindate != null ? tindate.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
