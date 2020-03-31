package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryValue = new StringBuilder();
        while (value > 1) {
            binaryValue.append(value % 2);
            value = value / 2;
        }
        binaryValue.append("1");
        return value == 0 ? "0" : value == 1 ? "1": binaryValue.reverse().toString();
    }
}
