package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */

    public String toBinaryString(int value) {
        int currentValue = value;
        StringBuilder binaryValue = new StringBuilder();
        int binaryRepresentation;

        while (currentValue != 0) {
            binaryRepresentation = currentValue % 2;
            binaryValue.append(binaryRepresentation);
            currentValue = currentValue / 2;
        }
        return value == 0 ? "0" : binaryValue.reverse().toString();
    }
}


