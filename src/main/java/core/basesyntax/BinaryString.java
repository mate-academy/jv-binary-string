package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binary = new StringBuilder();
        if (value == 0) {
            return new String(binary.append(value));
        }
        while (value > 1) {
            binary.append(value % 2);
            value = (value - value % 2) / 2;
        }
        binary.append(value);
        binary.reverse();
        return new String(binary);
    }
}
