package core.basesyntax;

public class BinaryString {
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        for (int num = value; num > 0; num /= 2) {
            sb.append(num%2);
        }
        return (value == 0) ? String.valueOf(value) : sb.reverse().toString();
    }
}
