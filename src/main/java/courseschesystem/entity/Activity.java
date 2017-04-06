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
public class Activity {
    private String actid;
    private String acorg;
    private String acontent;

    @Id
    @Column(name = "actid")
    public String getActid() {
        return actid;
    }

    public void setActid(String actid) {
        this.actid = actid;
    }

    @Basic
    @Column(name = "acorg")
    public String getAcorg() {
        return acorg;
    }

    public void setAcorg(String acorg) {
        this.acorg = acorg;
    }

    @Basic
    @Column(name = "acontent")
    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (actid != null ? !actid.equals(activity.actid) : activity.actid != null) return false;
        if (acorg != null ? !acorg.equals(activity.acorg) : activity.acorg != null) return false;
        return acontent != null ? acontent.equals(activity.acontent) : activity.acontent == null;
    }

    @Override
    public int hashCode() {
        int result = actid != null ? actid.hashCode() : 0;
        result = 31 * result + (acorg != null ? acorg.hashCode() : 0);
        result = 31 * result + (acontent != null ? acontent.hashCode() : 0);
        return result;
    }
}
