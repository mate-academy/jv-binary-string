package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder buff = new StringBuilder();
        String result = "0";
        if (value > 0) {
            while (value != 0) {
                if (value % 2 == 0) {
                    buff.append(0);
                } else {
                    buff.append(1);
                }
                value = value / 2;

            }
            buff.reverse();
            result = buff.toString();
            return result;
        }
        return result;
    }
}
