package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder binaryString = new StringBuilder();
        while (value >= 1) {
            binaryString.append(value % 2);
            value /= 2;
        }
        return binaryString.reverse().toString();
    }
}
