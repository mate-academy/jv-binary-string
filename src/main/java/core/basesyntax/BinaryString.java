package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.append(value % 2);
            value = value / 2;
        }
        return sb.reverse().toString();
    }
}