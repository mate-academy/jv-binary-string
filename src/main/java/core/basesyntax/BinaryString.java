package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String result = "";
        String reverse = "";
        do {
            reverse += value % 2;
            value /= 2;
        } while (value >= 1);
        for (int i = reverse.length() - 1; i >= 0; i--) {
            result += reverse.charAt(i);
        }
        return result;
    }
}
