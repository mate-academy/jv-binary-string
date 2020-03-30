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
            StringBuilder result = new StringBuilder();
            while (value > 0) {
                result.insert(0, value % 2);
                value = value / 2;
            }
            return result.toString();
        }
    }
}
