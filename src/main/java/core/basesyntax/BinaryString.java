package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder("");
        if (value == 0) {
            return "0";
        }
        for (int i = value; i > 0; i /= 2) {
            if (i != 1) {
                binaryString.append(i % 2);
            } else {
                binaryString.append(1);
            }
        }
        return binaryString.reverse().toString();
    }
}
