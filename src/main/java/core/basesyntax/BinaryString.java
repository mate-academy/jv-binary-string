package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String num = "";
        int b;
        if (value != 0) {
            while (value != 0) {
                b = value % 2;
                num = b + num;
                value /= 2;
            }
        } else {
            num = "0";
        }
        return num;
    }
}


