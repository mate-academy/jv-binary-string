package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {
        StringBuilder binaryStr = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        while (value != 0) {
            binaryStr.append(value % 2);
            value = value / 2;
        }
        return binaryStr.reverse().toString();
    }
}
