package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        int b;
        String temp = "";
        if (value == 0) {
            return "0";
        }
        while (value != 0) {
            b = value % 2;
            temp = b + temp;
            value = value / 2;
        }
        return temp;
    }
}
