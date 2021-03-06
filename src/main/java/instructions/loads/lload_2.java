package instructions.loads;

import instructions.base.Index8Instruction;
import rtda.Frame;

public class lload_2 extends Index8Instruction {
    @Override
    public int getOpCode() {
        return 0x20;
    }

    @Override
    public void execute(Frame frame) throws Exception {
        long val = frame.getLocalVars().getLong(2);
        frame.getOperandStack().pushLong(val);
    }
}
