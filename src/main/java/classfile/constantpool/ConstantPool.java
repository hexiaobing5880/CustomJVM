package classfile.constantpool;

import classfile.ClassReader;
import lombok.Getter;

@Getter
public class ConstantPool {

    private final int constantPoolSize;
    private ConstantInfo[] constantInfos;

    public ConstantPool(ClassReader reader) {
        constantPoolSize = reader.nextU2ToInt();
        constantInfos = new ConstantInfo[constantPoolSize];
        for (int i = 1; i < constantPoolSize; i++) {
            int tag = reader.nextU1toInt();
            ConstantInfo constInfo = ConstantInfo.createConstantInfo(tag, reader, this);
            constantInfos[i] = constInfo;

            if (tag == ConstantInfo.CONST_TAG_DOUBLE || tag == ConstantInfo.CONST_TAG_LONG) {
                i++;
            }
        }
    }

    public String getUTF8(int index) {
        ConstantInfo constInfo = this.constantInfos[index];
        return constInfo == null ? "" : constInfo.toString();
    }

    public String getClassName(int idx){
        ConstantClassInfo classInfo = (ConstantClassInfo) this.constantInfos[idx];
        return this.getUTF8(classInfo.getNameIndex());
    }

}
