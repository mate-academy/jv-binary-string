package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryValue = new StringBuilder();
        if (value == 0) {
            return "0";
        } else if (value == 1) {
            return "1";
        }
        while (value > 1) {
            int remainder = value % 2;
            binaryValue.append(remainder);
            value = value / 2;
        }
        binaryValue.append("1");
        return binaryValue.reverse().toString();
    }
}
