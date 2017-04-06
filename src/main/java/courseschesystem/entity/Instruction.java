package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 14:39 2017/4/6
 * @Modified By:
 */
@Entity
public class Instruction {

    private String insid;
    private String courseid;
    private String tid;
    private String rid;
    private int instime;

    @Id
    @Column(name = "insid")
    public String getInsid() {
        return insid;
    }

    public void setInsid(String insid) {
        this.insid = insid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "instime")
    public int getInstime() {
        return instime;
    }

    public void setInstime(int instime) {
        this.instime = instime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Instruction that = (Instruction) o;

        if (instime != that.instime) return false;
        return insid != null ? insid.equals(that.insid) : that.insid == null;
    }

    @Override
    public int hashCode() {
        int result = insid != null ? insid.hashCode() : 0;
        result = 31 * result + instime;
        return result;
    }
}
