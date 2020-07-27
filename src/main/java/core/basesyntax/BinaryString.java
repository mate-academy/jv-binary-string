package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder binaryString = new StringBuilder();
        while (value >= 1) {
            binaryString.append(value % 2);
            value = value / 2;
        }
        return String.valueOf(binaryString.reverse());
    }
}
