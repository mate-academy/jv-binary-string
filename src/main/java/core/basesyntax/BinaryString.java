package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public static String toBinaryString(int value) {
        StringBuilder str = new StringBuilder();
        if (value < 1) {
            return "0";
        }
        while (value > 0) {
            str.append(value % 2);
            value /= 2;
        }
        return str.reverse().toString();
    }

}
