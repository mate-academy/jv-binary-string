package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        String result = "";
        while (value > 0) {
            int a = value % 2;
            result = a + result;
            value = value / 2;
        }
        return result;
    }
}
