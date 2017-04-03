package courseschesystem.entity;

/**
 * Created by Lily on 2017/3/31.
 */
public class Classroom {
    private String rid;
    private String rname;
    private int seatnum;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(int seatnum) {
        this.seatnum = seatnum;
    }
}
