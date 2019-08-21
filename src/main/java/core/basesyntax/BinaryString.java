package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String binaryString = "";
        if (value == 0) {
            binaryString = "0";
        }
        while (value > 0) {
            binaryString = "" + value % 2 + binaryString;
            value = value / 2;
        }
        return binaryString;
    }
}
