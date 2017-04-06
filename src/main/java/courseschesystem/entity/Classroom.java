package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Lily on 2017/3/31.
 */
@Entity
public class Classroom {
    private String rid;
    private String rname;
    private int seatnum;

    @Id
    @Column(name = "rid")
    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "rname")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Basic
    @Column(name = "seatnum")
    public int getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(int seatnum) {
        this.seatnum = seatnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classroom classroom = (Classroom) o;

        if (seatnum != classroom.seatnum) return false;
        if (rid != null ? !rid.equals(classroom.rid) : classroom.rid != null) return false;
        return rname != null ? rname.equals(classroom.rname) : classroom.rname == null;
    }

    @Override
    public int hashCode() {
        int result = rid != null ? rid.hashCode() : 0;
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        result = 31 * result + seatnum;
        return result;
    }
}
