package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        for (int num = value; num > 0; num /= 2) {
            sb.append(num%2);
        }
        return (value == 0) ? String.valueOf(value) : sb.reverse().toString();
    }
}
