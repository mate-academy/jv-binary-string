package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) return "0";
        StringBuilder builder = new StringBuilder("");
        int remainder = 0;
        while(value >= 1) {
            if(value == 1) {
                builder.append(1);
                break;
            }
            else {
                remainder = value % 2;
                builder.append(remainder);
                value = Math.round(value / 2);
            }
        }
        return builder.reverse().toString();
    }
}
