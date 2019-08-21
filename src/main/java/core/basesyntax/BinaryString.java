package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {

        if (value == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (value > 0) {
            binary.append(value % 2);
            value /= 2;
        }
        return binary.reverse().toString();
    }
}
