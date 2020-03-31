package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public static String toBinaryString(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.append(value % 2);
            value = value / 2;
        } while (value >= 1);
        return stringBuilder.reverse().toString();
    }
}
