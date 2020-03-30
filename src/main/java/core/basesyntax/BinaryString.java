package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {

        StringBuilder stringBuilder = new StringBuilder();

        do {

            if (value % 2 == 0) {
                stringBuilder.append(0);
            } else {
                stringBuilder.append(1);
            }

            value = value / 2;

        } while (value >= 1);

        return stringBuilder.reverse().toString();
    }
}
