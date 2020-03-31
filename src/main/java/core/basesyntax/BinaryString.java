package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (value > 0) {
            itog = itog.append(value % 2);
            value = (value / 2);
        }
        return itog.reverse().toString();

    }
}
