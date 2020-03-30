package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binar = new StringBuilder();
        do {
            binar.append(value % 2);
            value /= 2;
        } while (value > 0);
        return binar.reverse().toString();
    }
}
