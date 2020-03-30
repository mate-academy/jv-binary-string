package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        int temp = value;
        while (temp != 0) {
            sb.append(temp % 2);
            temp /= 2;
        }
        return value == 0 ? "0" : sb.reverse().toString();
    }
}
