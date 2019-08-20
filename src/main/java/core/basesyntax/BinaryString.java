package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value != 0) {
            String binStr = "";
            while (value > 0) {
                int modulo = value % 2;
                binStr = modulo + binStr;
                value = value / 2;
            }
            return binStr;
        }
        return "0";
    }
}
