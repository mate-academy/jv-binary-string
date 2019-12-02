package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder value2 = new StringBuilder();
        if (value == 0) {
            value2.append(0);
        } else if (value == 1) {
            value2.append(1);
        } else {
            while (value != 0) {
                if (value % 2 > 0) {
                    value2.append(1);
                } else {
                    value2.append(0);
                }
                value = value / 2;
            }
        }
        return value2.reverse().toString();
    }
}
