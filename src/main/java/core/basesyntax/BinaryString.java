package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) { //https://mate-academy.github.io/style-guides/java/java.html#s4.1.1-braces-always-used
            return "0";
        } else {
            StringBuilder sb = new StringBuilder();

            while (value > 0) {
                sb.insert(0, value % 2);
                value = value / 2;
            }
            return sb.toString();
        }
    }
}
