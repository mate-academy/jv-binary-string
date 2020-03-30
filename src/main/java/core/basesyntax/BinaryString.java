package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value > 0) {
            StringBuilder sb = new StringBuilder();

            while (value > 0) {
                if (value % 2 == 0) {
                    sb.insert(0,"0");
                } else {
                    sb.insert(0,"1");
                }
                value = value / 2;
            }
            return sb.toString();
        }
        return "0";
    }
}
