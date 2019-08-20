package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        } else {
            String binaryNumber = "";
            while (value >= 1) {
                if (value % 2 != 0) {
                    binaryNumber += "1";
                } else {
                    binaryNumber += "0";
                }
                value /= 2;
            }
            StringBuilder builder = new StringBuilder(binaryNumber).reverse();
            return builder.toString();
        }
    }
}
