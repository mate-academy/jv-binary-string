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
        StringBuilder sb = new StringBuilder();
        while (value != 0) {
            if ((value & 1) == 1) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            value /= 2;
        }
        return sb.reverse().toString();
    }
}
