package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        int residue;
        StringBuilder container = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        while (value != 0) {
            residue = value % 2;
            container.append(residue);
            value = value / 2;
        }
        container.reverse();
        return container.toString();
    }
}
