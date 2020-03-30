package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder buffer = new StringBuilder();
        if (value > 0) {
            while (value != 0) {
                buffer.append(value % 2);
                value /= 2;
            }
        } else {
            buffer.append(0);
        }
        return buffer.reverse().toString();
    }
}
