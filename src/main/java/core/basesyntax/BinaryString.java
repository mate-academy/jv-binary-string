package core.basesyntax;

public class BinaryString {
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        result.append(value == 0 ? "0" : "");
        for (; value > 0; ) {
            result.append(value % 2 != 0 ? "1" : "0");
            value /= 2;
        }
        return result.reverse().toString();
    }
}
