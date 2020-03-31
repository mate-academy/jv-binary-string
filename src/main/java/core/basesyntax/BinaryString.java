package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder();
        do {
            if (value % 2 > 0) {
                binaryString = binaryString.append(1);
            } else {
                binaryString = binaryString.append(0);
            }
            value /= 2;
        } while (value > 0);
        return binaryString.reverse().toString();
    }
}
