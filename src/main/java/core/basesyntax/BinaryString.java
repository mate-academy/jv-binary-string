package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder resultStringBuilder = new StringBuilder();
        if (value == 0) {
            resultStringBuilder.append('0');
        } else {
            while (value > 0) {
                resultStringBuilder.append(value % 2);
                value /= 2;
            }
        }
        return resultStringBuilder.reverse().toString();
    }
}
