package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        while (value > 0) {
            stringBuilder.append(value % 2);
            value = value / 2;
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("0");
        }
        return stringBuilder.reverse().toString();
    }
}
