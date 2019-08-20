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
        StringBuilder binString = new StringBuilder();
        while (value > 0) {
            binString.insert(0,value & 1);
            value = value >> 1;
        }
        return binString.toString();
    }
}
