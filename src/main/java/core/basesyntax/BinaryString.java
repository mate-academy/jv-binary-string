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
        StringBuffer sb = new StringBuffer("");
        while (value > 0) {
            if ((value % 2) == 0)  {
                sb.append("0");
            } else {
                sb.append("1");
            }
            value /= 2;
        }
        return sb.reverse().toString();
    }
}
