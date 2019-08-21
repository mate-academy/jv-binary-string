package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str = new StringBuilder();
        if (value == 0) {
            str.append(0);
        }
        while (value != 0) {
            str.append(String.valueOf(value % 2).concat(""));
            value /= 2;
        }
        return str.reverse().toString();
    }
}
