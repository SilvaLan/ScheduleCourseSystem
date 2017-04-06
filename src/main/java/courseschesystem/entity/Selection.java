package courseschesystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 11:04 2017/4/3
 * @Modified By:
 */
@Entity
@IdClass(SelectionPK.class)
public class Selection {

    private String stuid;
    private String courseid;

    @Id
    @Column(name = "courseid")
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    @Id
    @Column(name = "stuid")
    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Selection selection = (Selection) o;

        if (stuid != null ? !stuid.equals(selection.stuid) : selection.stuid != null) return false;
        return courseid != null ? courseid.equals(selection.courseid) : selection.courseid == null;
    }

    @Override
    public int hashCode() {
        int result = stuid != null ? stuid.hashCode() : 0;
        result = 31 * result + (courseid != null ? courseid.hashCode() : 0);
        return result;
    }
}
