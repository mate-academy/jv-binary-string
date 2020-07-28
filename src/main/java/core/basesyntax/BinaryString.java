package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder container = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        while (value != 0) {
            container.append(value % 2);
            value = value / 2;
        }
        container.reverse();
        return container.toString();
    }
}
