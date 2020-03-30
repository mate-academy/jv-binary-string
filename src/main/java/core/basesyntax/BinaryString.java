package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        int z = value;
        while (z != 0) {
            sb.append(z % 2);
            z /= 2;
        }
        return value == 0 ? "0" : sb.reverse().toString();
    }
}
