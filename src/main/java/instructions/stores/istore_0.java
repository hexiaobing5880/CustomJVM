package instructions.stores;

import instructions.base.NoOperandsInstruction;
import rtda.Frame;

public class istore_0 extends NoOperandsInstruction {
    @Override
    public int getOpCode() {
        return 0x3b;
    }

    @Override
    public void execute(Frame frame) {
        int val = frame.getOperandStack().popInt();
        frame.getLocalVars().setInt(0, val);
    }
}
