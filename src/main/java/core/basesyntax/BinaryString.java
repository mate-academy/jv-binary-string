package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     * @return
     */
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        int b;
        if (value != 0) {
            while (value != 0) {
                result.append(value % 2);
                value /= 2;
            }
        } else {
            result.append(0);
        }
        return result.reverse().toString();
    }
}
