package classfile.constantpool;

import classfile.ClassReader;

/**
 * @Author: panda
 * @Date: 2018/10/3 0003 12:41
 */
public class ConstantDoubleInfo implements ConstantInfo {

    private Double value;

    public ConstantDoubleInfo(ClassReader reader) {
        //u4
        value = reader.next2U4Double();
    }
    public Double value(){
        return value;
    }

    @Override
    public int tag() {
        return ConstantInfo.CONST_TAG_INTEGER;
    }

    @Override
    public String getValue() {
        return value + "";
    }

    @Override
    public String toString() {
        return "Double:" + value;
    }

}
