package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        while (value > 0) {
            if (value % 2 == 0) {
                binaryString.append(0);
            } else {
                binaryString.append(1);
            }
            value = value / 2;
        }
        return binaryString.reverse().toString();
    }
}
