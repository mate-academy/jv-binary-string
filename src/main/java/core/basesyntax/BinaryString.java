package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        int temp;
        StringBuilder res = new StringBuilder();
        if (value == 0) {
            return "0";
        } else {
            while (value != 0) {
                temp = value % 2;
                res.append(temp);
                value = value / 2;
            }
        }
        return res.reverse().toString();
    }
}

