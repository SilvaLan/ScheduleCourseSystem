package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 21:16 2017/4/7
 * @Modified By:
 */
@Entity
public class Major {
    private String majorid;
    private String majorname;
    private String aid;
    private double obcredit;
    private double opcredit;
    private double sumcredit;

    @Id
    @Column(name = "majorid")
    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
    }

    @Basic
    @Column(name = "majorname")
    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
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
    @Column(name = "obcredit")
    public double getObcredit() {
        return obcredit;
    }

    public void setObcredit(double obcredit) {
        this.obcredit = obcredit;
    }

    @Basic
    @Column(name = "opcredit")
    public double getOpcredit() {
        return opcredit;
    }

    public void setOpcredit(double opcredit) {
        this.opcredit = opcredit;
    }

    @Basic
    @Column(name = "sumcredit")
    public double getSumcredit() {
        return sumcredit;
    }

    public void setSumcredit(double sumcredit) {
        this.sumcredit = sumcredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Major major = (Major) o;

        if (Double.compare(major.obcredit, obcredit) != 0) return false;
        if (Double.compare(major.opcredit, opcredit) != 0) return false;
        if (Double.compare(major.sumcredit, sumcredit) != 0) return false;
        if (majorid != null ? !majorid.equals(major.majorid) : major.majorid != null) return false;
        if (majorname != null ? !majorname.equals(major.majorname) : major.majorname != null) return false;
        return aid != null ? aid.equals(major.aid) : major.aid == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = majorid != null ? majorid.hashCode() : 0;
        result = 31 * result + (majorname != null ? majorname.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        temp = Double.doubleToLongBits(obcredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(opcredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sumcredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
