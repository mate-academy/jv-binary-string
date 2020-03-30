package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str = new StringBuilder();
        str.append(value == 0 ? "0" : "");
        while (value > 0) {
            str.append((value % 2 == 0) ? "0" : "1");
            value /= 2;
        }
        return str.reverse().toString();
    }
}
