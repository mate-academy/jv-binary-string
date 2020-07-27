package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    String toBinaryString(int value) {
        int result = 0;
        int digitCounter = 0;
        while (value > 0) {
            result += value % 2 * Math.pow(10, digitCounter);
            value = value / 2;
            digitCounter++;
        }
        return String.valueOf(result);
    }
}

