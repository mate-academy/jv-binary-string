package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        for (int i = value; Math.abs(i) > 0; i = Math.abs(i) / 2) {
            sb.append(i % 2);
        }
        return value == 0 ? "0" : sb.reverse().toString();
    }
}
