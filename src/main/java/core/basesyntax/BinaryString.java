package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder();
        if (value == 0) {
            binaryString.append(0);
        } else {
            while (value >= 1) {
                binaryString.append(value % 2);
                value = value / 2;
            }
        }
        return binaryString.reverse().toString();
    }
}
