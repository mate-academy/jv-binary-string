package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int num = value; num > 0; num /= 2) {
            sb.append(num % 2);
        }
        return sb.reverse().toString();
    }
}
