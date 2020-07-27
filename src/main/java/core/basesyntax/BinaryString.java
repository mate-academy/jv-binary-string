package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder res = new StringBuilder();
        for (int i = value; i > 0; i /= 2) {
            res.append(i % 2);
        }
        return (value == 0) ? "0" : res.reverse().toString();
    }
}
