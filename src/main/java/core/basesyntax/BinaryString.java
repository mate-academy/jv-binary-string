package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder binaryValue = new StringBuilder();
        for (int num = value; num > 0; num /= 2) {
            binaryValue.append(num % 2);
        }
        return binaryValue.reverse().toString();
    }
}
