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
        String temp = "";
        String result = "";

        for (; value > 0; value /= 2) {
            temp += (value % 2) == 0 ? "0" : "1";
        }

        for (int i = temp.length() - 1; i >= 0; i--) {
            result += temp.charAt(i);
        }

        return result;
    }
}
