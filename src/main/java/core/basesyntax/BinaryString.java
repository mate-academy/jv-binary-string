package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        int result = value;
        while (true) {
            stringBuilder.append(result % 2);
            result = result / 2;
            if (result < 1) {
                return stringBuilder.reverse().toString();
            }
        }
    }
}
