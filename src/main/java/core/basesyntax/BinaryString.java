package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder byteCode = new StringBuilder();
        if (value == 0) {
            return "0";
        }
            for (int i = value; i >= 1; i /= 2) {
                if (i % 2 == 0) {
                    byteCode.append(0);
                } else {
                    byteCode.append(1);
                }
            }
        return byteCode.reverse().toString();
    }
}
