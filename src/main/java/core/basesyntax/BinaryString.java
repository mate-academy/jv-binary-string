package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {

        StringBuilder valueToBinary = new StringBuilder();
        int decimal = value;

        while (decimal > 0) {
            valueToBinary.append(decimal % 2);
            decimal /= 2;
        }

        return value == 0 ? String.valueOf(0) : valueToBinary.reverse().toString();
    }
}
