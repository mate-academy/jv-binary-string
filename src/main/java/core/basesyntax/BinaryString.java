package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        for (int i = value; i > 0; i /= 2) {
            sb = i % 2 == 0
                    ? sb.append("0")
                    : sb.append("1");
        }
        return (value == 0) ? String.valueOf(value) : sb.reverse().toString();
    }
}
