package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        if (value != 0) {
            while (value > 0) {
                result.append(String.valueOf(value % 2));
                value = value / 2;
            }
        } else {
            result.append(0);
        }
        result = result.reverse();
        return result.toString();
    }
}
