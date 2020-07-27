package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder();
        if (value == 0) {
            binaryString.insert(0, Integer.toString(0));
        }
        while (value != 0) {
            int i = value % 2;
            binaryString.insert(0, Integer.toString(i));
            value /= 2;
        }

        return binaryString.toString();
    }
}

