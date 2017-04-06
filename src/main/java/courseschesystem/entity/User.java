package courseschesystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zzh on 2017/3/29.
 */
@Entity
public class User {
    private String uid;
    private String upwd;
    private String utype;

    public User(String uid,String upwd,String utype){
        this.uid = uid;
        this.upwd = upwd;
        this.utype = utype;
    }

    @Id
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "upwd")
    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Basic
    @Column(name = "utype")
    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uid != null ? !uid.equals(user.uid) : user.uid != null) return false;
        if (upwd != null ? !upwd.equals(user.upwd) : user.upwd != null) return false;
        return utype != null ? utype.equals(user.utype) : user.utype == null;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (upwd != null ? upwd.hashCode() : 0);
        result = 31 * result + (utype != null ? utype.hashCode() : 0);
        return result;
    }
}
