package courseschesystem.entity;

import javax.persistence.*;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 21:16 2017/4/7
 * @Modified By:
 */
@Entity
public class Instruction {
    private String insid;
    private String courseid;
    private String rid;
    private int instime;
    private String tid;

    @Id
    @Column(name = "insid")
    public String getInsid() {
        return insid;
    }

    public void setInsid(String insid) {
        this.insid = insid;
    }

    @Basic
    @Column(name = "courseid")
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
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
    @Column(name = "instime")
    public int getInstime() {
        return instime;
    }

    public void setInstime(int instime) {
        this.instime = instime;
    }

    @Basic
    @Column(name = "tid")
    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Instruction that = (Instruction) o;

        if (instime != that.instime) return false;
        if (insid != null ? !insid.equals(that.insid) : that.insid != null) return false;
        if (courseid != null ? !courseid.equals(that.courseid) : that.courseid != null) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;
        return tid != null ? tid.equals(that.tid) : that.tid == null;
    }

    @Override
    public int hashCode() {
        int result = insid != null ? insid.hashCode() : 0;
        result = 31 * result + (courseid != null ? courseid.hashCode() : 0);
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        result = 31 * result + instime;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        return result;
    }
}
