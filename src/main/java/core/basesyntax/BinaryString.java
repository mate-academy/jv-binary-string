package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 1 || value == 0) {
            return "" + value;
        }
        StringBuilder resultStr = new StringBuilder();
        for (int i = value; i > 0; i /= 2) {
            resultStr.append(i % 2 == 0 ? 0 : 1);
        }

        return resultStr.reverse().toString();
    }
}
