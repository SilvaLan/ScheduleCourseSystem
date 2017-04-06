package courseschesystem.dao.impl;

import courseschesystem.dao.InstructionDAO;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 14:24 2017/4/6
 * @Modified By:
 */
public class InstructionDAOImpl implements InstructionDAO {
    //添加授课记录
    public boolean addInstruction(Instruction instruction){


        return true;
    }
    //删除授课记录
    public boolean deleteInstruction(Instruction instruction){

        return  true;
    }
    //修改授课记录
    public boolean modifyInstruction(Instruction instruction){

        return  true;
    }
    //查询授课记录
    public List<Instruction> queryInstruction(Instruction instruction){

        return null;
    }
    //根据教师编号，查询授课的课程总数
    public int getInstructionSumByTid(String tid){

        return 0;
    }
}
