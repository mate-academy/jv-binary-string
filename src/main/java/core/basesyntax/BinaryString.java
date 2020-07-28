package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        if (value > 1) {
            while (value > 0) {
                int s = !(value % 2 == 0) ? 1 : 0;
                value /= 2;
                stringBuilder.append(s);
            }
            return stringBuilder.reverse().toString();
        }
        return String.valueOf(value);
    }
}