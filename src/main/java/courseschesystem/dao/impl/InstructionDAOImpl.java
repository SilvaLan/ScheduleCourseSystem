package courseschesystem.dao.impl;

import courseschesystem.dao.BaseHibernateDAO;
import courseschesystem.dao.InstructionDAO;
import courseschesystem.entity.Instruction;

import java.util.List;

/**
 * @Author: zzh
 * @Description:
 * @Date: Created in 14:24 2017/4/6
 * @Modified By:
 */
public class InstructionDAOImpl extends BaseHibernateDAO implements InstructionDAO {
    //添加授课记录
    public boolean add(Instruction instruction){
        return super.add(instruction);
    }
    //删除授课记录
    public boolean delete(Instruction instruction){
        return super.delete(instruction);
    }
    //修改授课记录
    public boolean update(Instruction instruction){
        return  super.update(instruction);
    }

    public Instruction get(String id){
        return (Instruction)super.get(Instruction.class,id);
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
