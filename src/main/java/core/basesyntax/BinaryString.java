package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String s = "";
        if (value == 0) {
            s = "0";
        }
        while (value > 0) {
            s = "" + value % 2 + s;
            value = value / 2;
        }
        return s;
    }
}
