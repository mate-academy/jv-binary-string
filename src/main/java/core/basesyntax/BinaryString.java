package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        int number = value;
        while (number > 0) {
            result.append(number % 2);
            number /= 2;
        }

        return value == 0 ? "0" : result.reverse().toString();
    }
}
