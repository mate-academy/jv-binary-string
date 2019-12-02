package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder();
        String result = "0";
        if (value > 0) {
            while (value != 0) {
                binaryString.append(value % 2);
                value = value / 2;
            }
            result = binaryString.reverse().toString();
        }
        return result;
    }
}
