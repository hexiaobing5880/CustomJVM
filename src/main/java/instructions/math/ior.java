package instructions.math;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;
import rtda.OperandStack;

public class ior extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x80;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        OperandStack operandStack = frame.getOperandStack();
        int v2 = operandStack.popInt();
        int v1 = operandStack.popInt();
        operandStack.pushInt(v1 | v2);
    }
}
