package courseschesystem.service.impl;

import courseschesystem.dao.InstructionDAO;
import courseschesystem.dao.impl.InstructionDAOImpl;
import courseschesystem.entity.Instruction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zzh
 * @Description: 面向教师用户的 相关业务方法
 * @Date: Created in 19:32 2017/4/5
 * @Modified By:
 */
public class TeacherServiceImpl {

    public int[] teachTimeCount(String tid){
        /**
         * @Author: zzh
         * @Description: 统计教师的授课时长
         * @param time {total，monTime，tuseTime，wedsTime，hursTime，FriTime，saturTime，sunTime}
         * @param tid 教师编号
         * @output: 返回教师授课时长，其中teachtime[0]表示一周授课总时长，teachtime[i]分别表示星期i的授课时长
         * @Date: Created in 12:04 2017/4/2
         * @Modified By: zzh
         */
        int teachTime[] = {0};    //统计教师上课总时长
        int t1 = 0; int t2 = 0; int t3 = 0; int t4 = 0; int t5 = 0;//分别记录周一至周五每天的上课时长
        InstructionDAO instructionDAO = new InstructionDAOImpl();
        Instruction instruction = new Instruction();
        List<Instruction> instructions = new ArrayList<>();

        instruction.setTid(tid);
        instructions = instructionDAO.queryInstruction(instruction);//获得该老师一周内的上课情况

        teachTime[0] = instructions.size();
        //遍历Instruction的List集合，计算每门课每天的上课时长并累加得到老师一天上课的总时长
        for (Instruction ins : instructions) {
            teachTime[ins.getInstime()/10]++;
        }

        return teachTime;
    }

    public int tCourseNumCount(String tid) {
        /**
         * @Author: Yang
         * @Description: 统计教师总共教授的课程总数
         * @param tid 教师编号
         * @output: 返回总门数
         * @Date: Created in 12:07 2017/4/2
         * @Modified By: zzh
         */
        InstructionDAO instructionDAO = new InstructionDAOImpl();
        int courseNum = instructionDAO.getInstructionSumByTid(tid);    //统计教师教授的课程总门数
        if(courseNum>=0)
            return courseNum;
        else
            return 0;
    }


}
