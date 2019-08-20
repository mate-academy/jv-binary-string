package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {

        StringBuilder binString = new StringBuilder();
        while (value > 0) {
            binString.append(value & 1);
            value = value >> 1;
        }


    }
}
