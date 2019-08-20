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
        StringBuilder result = new StringBuilder("");

        for (; value > 0; value /= 2) {
            result = result.append((value % 2) == 0 ? "0" : "1");
        }

        return result.reverse().toString();
    }
}
