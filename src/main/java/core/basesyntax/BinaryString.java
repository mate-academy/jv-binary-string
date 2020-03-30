package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {

        int q = value;
        StringBuilder stringBuilder = new StringBuilder();

        do {
            if (q % 2 == 0) {
                stringBuilder.append(0);
            } else {
                stringBuilder.append(1);
            }
            q = q / 2;
        } while (q >= 1);
        return stringBuilder.reverse().toString();
    }
}
