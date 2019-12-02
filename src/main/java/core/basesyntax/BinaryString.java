package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String result = "";
        while (value !=0) {
            result += String.valueOf(value%2);
            value = value / 2;
        }
        return result;
    }
}
