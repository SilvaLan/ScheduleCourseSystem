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
public class Arrange {
    private String arid;
    private String caid;
    private String actype;
    private int acweek;
    private int acnum;

    @Id
    @Column(name = "arid")
    public String getArid() {
        return arid;
    }

    public void setArid(String arid) {
        this.arid = arid;
    }

    @Basic
    @Column(name = "caid")
    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid;
    }

    @Basic
    @Column(name = "actype")
    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    @Basic
    @Column(name = "acweek")
    public int getAcweek() {
        return acweek;
    }

    public void setAcweek(int acweek) {
        this.acweek = acweek;
    }

    @Basic
    @Column(name = "acnum")
    public int getAcnum() {
        return acnum;
    }

    public void setAcnum(int acnum) {
        this.acnum = acnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arrange arrange = (Arrange) o;

        if (acweek != arrange.acweek) return false;
        if (acnum != arrange.acnum) return false;
        if (arid != null ? !arid.equals(arrange.arid) : arrange.arid != null) return false;
        if (caid != null ? !caid.equals(arrange.caid) : arrange.caid != null) return false;
        return actype != null ? actype.equals(arrange.actype) : arrange.actype == null;
    }

    @Override
    public int hashCode() {
        int result = arid != null ? arid.hashCode() : 0;
        result = 31 * result + (caid != null ? caid.hashCode() : 0);
        result = 31 * result + (actype != null ? actype.hashCode() : 0);
        result = 31 * result + acweek;
        result = 31 * result + acnum;
        return result;
    }
}
