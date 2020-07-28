package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str = new StringBuilder("");
        while (value / 2 != 0) {
            str = str.append(value % 2);
            value = value / 2;
        }
        str = str.append(value);
        return str.reverse().toString();
    }
}
