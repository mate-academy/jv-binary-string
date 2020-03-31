package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int a) {
        if (a == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (a != 0) {
            result.append(a % 2);
            a = a / 2;
        }
        return result.reverse().toString();
    }
}
