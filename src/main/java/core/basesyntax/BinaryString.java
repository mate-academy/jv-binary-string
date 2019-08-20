package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String result = "";
        while (true) {
            if (value == 0) {
                result = "0";
                break;
            }
            if (value == 2) {
                result = "10" + result;
                break;
            }
            if (value == 1) {
                result = "1" + result;
                break;
            }
            if ((value % 2) == 1) {
                result = "1" + result;
            }
            if ((value % 2) == 0) {
                result = "0" + result;
            }
            value = value / 2;
        }
        return result;
    }
}
