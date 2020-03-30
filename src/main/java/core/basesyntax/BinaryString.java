package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        while (value > 1) {
            result.append(value % 2);
            value = value / 2;
        }
        result.append("1").reverse();
        return value == 0 ? Integer.toString(0) : result.toString();
    }
}
