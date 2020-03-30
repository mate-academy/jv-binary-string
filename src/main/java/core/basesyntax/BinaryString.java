package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        int valueBin;
        while (value > 0) {
            valueBin = value % 2;
            stringBuilder.append(valueBin);
            value = value / 2;
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("0");
        }
        return stringBuilder.reverse().toString();
    }
}
