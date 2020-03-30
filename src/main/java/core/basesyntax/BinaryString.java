package core.basesyntax;

public class BinaryString {
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        result.append(value == 0 ? "0" : "");
        for (int i = value; i > 0; i /= 2) {
            result.append(i % 2);
        }
        return result.reverse().toString();
    }
}
