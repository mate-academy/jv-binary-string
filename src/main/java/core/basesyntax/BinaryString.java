package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        if (value == 0)  {
            return String.valueOf(0);
        }
        while (value > 0) {
            int tempValue = ((value % 2) == 0) ? 0 : 1;
            result.append(tempValue);
            value = value / 2;
        }
        result.reverse();
        return result.toString();
    }
}
