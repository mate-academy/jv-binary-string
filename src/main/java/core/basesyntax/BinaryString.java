package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String result = "";
        if (value == 0)  {
            result = "0";
        }
        while (value > 0) {
            int binary = value % 2;
            result = String.format("%d%s", binary, result);
            value = value / 2;
        }
        return result;
    }
}
