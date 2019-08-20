package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        int a;
        String x = "";
        while (value > 0) {
            a = value % 2;
            x = x + "" + a;
            value = value / 2;
        }
        return x;
    }
}
