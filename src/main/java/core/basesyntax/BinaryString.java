package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        return compute(value).toString();
    }

    private Integer compute(int value) {
        if (value == 0) {
            return 0;
        } else {
            int n = value % 2;
            return n + 10 * compute(value / 2);
        }

    }
}
