package courseschesystem.common;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 15:29 2017/4/6
 * @Modified By:
 */
public class Schedule {
    /*
    授课教师
     */
    private String tid;
    private String tname;

    /*
    课程名称
     */
    private String courseid;
    private String coursename;

    /*
    专业编号
     */
    private String majorid;
    private String majorName;

    /*
    上课地点
     */
    private String rid;
    private String rname;

    /*
    上课时间，原则上不会出现连着上四节以上的课
     */
    private String coursetime;

    public Schedule() {
    }

    public Schedule(String tid, String tname, String courseid, String coursename, String majorid,String majorName, String rid, String rname, String coursetime) {
        this.tid = tid;
        this.tname = tname;
        this.courseid = courseid;
        this.coursename = coursename;
        this.majorid = majorid;
        this.rid = rid;
        this.rname = rname;
        this.coursetime = coursetime;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }

    public String getRid() {
        return rid;
    }


    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCourseid() {
        return courseid;
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
