package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0 || value == 1) {
            return Integer.toString(value);
        }

        StringBuilder builder = new StringBuilder();

        while (value >= 1) {
            builder.append( value % 2);
            value /= 2;
        }
        return builder.reverse().toString();
    }
}
