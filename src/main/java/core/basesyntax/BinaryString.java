package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {

        String temp = "";
        if (value > 0) {
            while (value != 0) {
                temp += value % 2;
                value /= 2;
            }
        } else {
            temp = "0";
        }
        StringBuffer buffer = new StringBuffer(temp);
        temp = buffer.reverse().toString();
        return temp;
    }
}
