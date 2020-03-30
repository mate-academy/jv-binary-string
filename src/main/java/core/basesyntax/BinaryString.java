package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value <= 1) {
            return String.valueOf(value);
        }
        StringBuilder result = new StringBuilder();
        while (value > 1) {
            result.append(String.valueOf(value % 2));
            value /= 2;
            if (value == 1) {
                result.append("1");
                break;
            }
        }
        return result.reverse().toString();
    }
}
