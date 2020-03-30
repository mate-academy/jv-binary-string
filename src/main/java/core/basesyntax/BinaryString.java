package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String result = "";
        do {
            result = (value % 2) + result;
            value = value / 2;
        } while (value > 0);
        return result;
    }
}