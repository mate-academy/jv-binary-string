package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder resultstring = new StringBuilder();
        while (value / 2 != 0) {
            resultstring = resultstring.append(value % 2);
            value = value / 2;
        }
        resultstring = resultstring.append(value);
        return resultstring.reverse().toString();
    }
}
