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
public class Instruction {
    private String insid;
    private int instime;

    @Id
    @Column(name = "insid")
    public String getInsid() {
        return insid;
    }

    public void setInsid(String insid) {
        this.insid = insid;
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
