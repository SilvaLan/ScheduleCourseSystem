package courseschesystem.entity;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 14:39 2017/4/6
 * @Modified By:
 */
public class Instruction {

    private String insid;
    private String courseid;
    private String tid;
    private String rid;
    private int instime;

    public String getInsid() {
        return insid;
    }

    public void setInsid(String insid) {
        this.insid = insid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public int getInstime() {
        return instime;
    }

    public void setInstime(int instime) {
        this.instime = instime;
    }
}
