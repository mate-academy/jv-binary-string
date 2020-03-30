package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str = new StringBuilder("");
        if (value == 0) {
            return "0";
        }
        while (value >= 1) {
            str.append(value % 2);
            value /= 2;
        }
        str.reverse();
        return str.toString();
    }
}
