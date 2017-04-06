package courseschesystem.action;

import courseschesystem.service.ArrangeService;
import courseschesystem.service.impl.ArrangeServiceImpl;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 9:40 2017/4/6
 * @Modified By:
 */
public class ArrangeAction {

    public String arrangeCourse(){
        /**
         * @Author: zzh
         * @Description: 排课动作，为某门课程排课，若无冲突，则排课成功
         *                ·需要从jsp获取的数据如下：
         *                  1.课程编号 courseid 专业缩写+XXXX
         *                  2.教室号 XXX
         *                  3.排课时间，即周几，第几节课 weekday,courseNum,通过这两个参数得到课时的号码courseIndex
         *                    如周二第5节课，weekday=2，courseNum=5，可以得到课时号码为25
         * @param
         * @output:
         * @Date: Created in 9:41 2017/4/6
         * @Modified By:
         */
        ArrangeService arrangeService = new ArrangeServiceImpl();
        String courseid = "";
        String rid = "";
        int weekday = 0;
        int courseNum = 0;

        /*
        通过session获得JSP数据
         */

        if(arrangeService.arrangeCourse(courseid,rid,weekday*10+courseNum)){//调用排课方法

            return "";
        }else {
            return "";
        }
    }

    public String arrangeActivity(){
        /**
         * @Author: zzh
         * @Description: 为临时活动排教室，若无冲突，则安排教室成功
         * @param
         * @output:
         * @Date: Created in 18:51 2017/4/6
         * @Modified By:
         */

        return "";
    }

}
