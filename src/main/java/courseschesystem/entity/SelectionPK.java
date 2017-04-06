package courseschesystem.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 20:01 2017/4/6
 * @Modified By:
 */
public class SelectionPK implements Serializable {
    private String stuid;
    private String courseid;

    @Column(name = "stuid")
    @Id
    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    @Column(name = "courseid")
    @Id
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SelectionPK that = (SelectionPK) o;

        if (stuid != null ? !stuid.equals(that.stuid) : that.stuid != null) return false;
        return courseid != null ? courseid.equals(that.courseid) : that.courseid == null;
    }

    @Override
    public int hashCode() {
        int result = stuid != null ? stuid.hashCode() : 0;
        result = 31 * result + (courseid != null ? courseid.hashCode() : 0);
        return result;
    }
}
