package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        int a = value;
        StringBuilder result = new StringBuilder();
        int b = 0;
        while (a != 0) {
            b = a % 2;
            result.append(b);
            a = a / 2;
        }
        return value == 0 ? "0" : result.reverse().toString();
    }
}
