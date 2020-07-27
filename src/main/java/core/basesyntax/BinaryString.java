package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        boolean isNegative = value < 0;
        if (isNegative) {
            value = -value;
        }
        StringBuilder result = new StringBuilder();
        for (int i = value; i > 0; i /= 2) {
            result.append(i % 2);
        }
        if (isNegative) {
            result.append("-");
        }
        return result.reverse().toString();
    }
}
