package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryResult = new StringBuilder();

        if (value == 0) {
            return "0";
        }

        for (int i = 0; value > 0; i++) {
            binaryResult.append(((value % 2) == 0 ? "0" : "1"));
            value /= 2;
        }

        return binaryResult.reverse().toString();
    }
}
