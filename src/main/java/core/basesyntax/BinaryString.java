package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder answer = new StringBuilder();
        do {
            if (value % 2 == 0) {
                answer.append('0');
            } else {
                answer.append('1');
            }
            value /= 2;
        } while (value != 0);
        return answer.reverse().toString();
    }
}
