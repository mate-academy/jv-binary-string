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
        StringBuilder result = new StringBuilder();
        int k = 0;
        while (value != 0) {
            k = value % 2;
            value /= 2;
            result.append(k);
        }
        return result.reverse().toString();
    }
}
