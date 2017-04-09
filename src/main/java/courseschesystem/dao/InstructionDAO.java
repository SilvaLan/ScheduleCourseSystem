package courseschesystem.dao;


import courseschesystem.entity.Instruction;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 14:24 2017/4/6
 * @Modified By:
 */
public interface InstructionDAO {

    //添加授课记录
    boolean add(Instruction instruction);
    //删除授课记录
    boolean delete(Instruction instruction);
    //修改授课记录
    boolean update(Instruction instruction);
    //加载数据
    Instruction get(String id);


    //查询授课记录
    List<Instruction> queryInstruction(Instruction instruction);
    //根据教师编号，查询授课的课程总数
    int getInstructionSumByTid(String tid);
}
