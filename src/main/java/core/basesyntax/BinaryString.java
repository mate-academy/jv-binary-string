package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binary = new StringBuilder();
        int remainder;
        if (value == 0 | value == 1) {
            binary.append(value);
        } else {
            while (value > 1) {
                remainder = value % 2;
                binary.append(remainder);
                value = (value - remainder) / 2;
            }
            binary.append(value);
            binary.reverse();
        }
        return new String(binary);
    }
}
