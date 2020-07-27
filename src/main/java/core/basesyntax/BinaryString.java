package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {

        StringBuilder binaryStr = new StringBuilder();
        int res = 0;

        if (value == 0) {
            return "0";
        }

        while (value != 0) {
            res = value % 2;
            binaryStr.append(res);
            value = value / 2;
        }

        String binary = binaryStr.reverse().toString();

        return binary;
    }
}
