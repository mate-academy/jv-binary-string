package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuilder resultBinary = new StringBuilder();
        if (value < 2) {
            resultBinary.append(value);
        } else {
            while (value > 0) {
                resultBinary.insert(0,value % 2);
                value = value / 2;
            }
        }
        return resultBinary.toString();
    }
}
