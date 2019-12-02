package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String bin = "";
        if (value != 0) {
            while (value > 0) {
                bin = (value % 2) + bin;
                value /= 2;
            }
            return bin;
        }
        return "0";
    }
}
