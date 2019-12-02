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

        String str = "";
        while (value > 0) {
            str = value % 2 + str;
            value /= 2;
        }
        return str;
    }
}
