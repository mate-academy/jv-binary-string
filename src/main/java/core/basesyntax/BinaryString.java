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
        StringBuilder myStringBuilder = new StringBuilder();
        while (value != 0) {
            if ((value & 1) == 1) {
                myStringBuilder.append(1);
            } else {
                myStringBuilder.append(0);
            }
            value /= 2;
        }
        return myStringBuilder.reverse().toString();
    }
}
