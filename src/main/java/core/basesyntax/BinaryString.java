package core.basesyntax;

public class BinaryString {
    protected String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        String binaryStr = "";
        while (value > 0) {
            binaryStr = (value & 1) + binaryStr;
            value >>= 1;
        }
        return binaryStr;
    }
}
