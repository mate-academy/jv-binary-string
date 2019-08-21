package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public  String toBinaryString(int value) {
        String res = "";
        while (value > 0) {
            res += ((value % 2) == 0 ? "0" : "1");
            value /= 2;
        }
        return new StringBuilder(res).reverse().toString();

    }


}

