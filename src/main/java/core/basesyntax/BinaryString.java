package core.basesyntax;

public class BinaryString {
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (value > 0) {
            result.insert(0, value % 2);
            value /= 2;
        }
        return result.toString();
    }
}
