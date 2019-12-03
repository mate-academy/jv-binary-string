package core.basesyntax;

public class BinaryString {
    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возврщает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuffer sb = new StringBuffer("");
        if (value == 0) {
            return "0";
        }
        for (int i = 0; value > 0; i++) {
            if (value % 2 == 0) {
                sb.insert(i,"0");
            } else {
                sb.insert(i,"1");
            }
            value = value / 2;
        }
        return (sb.reverse().toString());
    }
}
