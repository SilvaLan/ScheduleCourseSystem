package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 21:07 2017/4/7
 * @Modified By:
 */
@Entity
public class Academy {
    private String aid;
    private String aname;

    @Id
    @Column(name = "aid")
    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "aname")
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Academy academy = (Academy) o;

        if (aid != null ? !aid.equals(academy.aid) : academy.aid != null) return false;
        return aname != null ? aname.equals(academy.aname) : academy.aname == null;
    }


}
