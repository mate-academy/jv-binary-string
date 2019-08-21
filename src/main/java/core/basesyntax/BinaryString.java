package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder str =  new StringBuilder("");
        if (value == 0) {
            str.append(0);
            return str.toString();
        }
        while (value >= 1) {
            if (value % 2 == 1) {
                str.append(1);
            } else {
                str.append(0);
            }
            value /= 2;
        }


        return str.reverse().toString();
    }
}
