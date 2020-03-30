package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder builder = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        for (int i = value; i >= 1; i /= 2) {
            builder.append(i % 2);
        }
        return builder.reverse().toString();
    }
}
