package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryStringValue = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        while (value > 0) {
            binaryStringValue.append(value % 2);
            value = value / 2;
        }
        return binaryStringValue.reverse().toString();
    }
}
