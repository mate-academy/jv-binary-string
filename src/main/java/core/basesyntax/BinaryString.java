package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binary = new StringBuilder();
        do {
            binary.append(value % 2);
            value /= 2;
        } while (value >= 1);
        return binary.reverse().toString();;
    }
}
