package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        //looking for root of maximal bit of value
        int root = 0;
        int tmp = 1;
        while (tmp * 2 <= value) {
            tmp *= 2;
            root++;
        }

        StringBuilder result = new StringBuilder();
        tmp = value;
        for (int i = root; i > 0; i--) {
            if (Math.pow(2, i) <= tmp) {
                result.append("1");
                tmp -= Math.pow(2, i);
            } else {
                result.append("0");
            }
        }
        if (value % 2 == 0) {
            result.append("0");
        } else {
            result.append("1");
        }
        return result.toString();
    }
}
