package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder bin = new StringBuilder();

        if (value == 0) {
            return "0";
        }
        while (value > 0) {
            bin.append(value % 2 == 0 ? 0 : 1);
            value = value / 2;
        }

        return bin.reverse().toString();
    }
}
