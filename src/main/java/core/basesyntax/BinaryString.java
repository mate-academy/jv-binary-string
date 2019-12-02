package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        StringBuffer sb = new StringBuffer();
        if (value != 0) {

            while (value != 0) {
                String appendToBinaryString = String.valueOf(value % 2);
                sb.append(appendToBinaryString);
                value  /= 2;
            }
        }else {
            sb.append(0);
        }
        return sb.reverse().toString();
    }
}
