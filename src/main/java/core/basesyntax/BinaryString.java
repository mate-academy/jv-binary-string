package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String binaryString = "";
        int multiply = 1;
        int binaryNumber = 0;
        while (value > 0) {
            binaryNumber += (value % 2) * multiply;
            value /= 2;
            multiply *= 10;
        }
        binaryString = "" + binaryNumber;
        return binaryString;
    }
}
