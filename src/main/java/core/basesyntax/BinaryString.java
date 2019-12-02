package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder bin  = new StringBuilder();
        int i = 0;
        while (value > 1) {
            bin.append(value % 2);
            value /= 2;
        }
        return bin.append(value).reverse().toString();
    }
}
