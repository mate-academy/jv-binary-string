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
        StringBuilder result = new StringBuilder();
        int power = 0;
        while (Math.pow(2, power) <= value) {
            power++;
        }
        power--;
        while (power >= 0) {
            if (Math.pow(2, power) > value) {
                result.append("0");
                power--;
            } else {
                value -= Math.pow(2, power);
                power--;
                result.append("1");
            }
        }
        return result.toString();
    }
}
