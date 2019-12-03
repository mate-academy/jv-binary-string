package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public static String toBinaryString(int value) {
        StringBuilder str = new StringBuilder();
        int start = 1;
        while (sumOfNumber(start) < value) {
            start *= 2;
        }

        if (value == 0) {
            return "0";
        }
        while (start > 0) {
            if (value > start - 1) {
                str.append(1);
                value -= start;
            } else {
                str.append(0);
            }
            start = (int) Math.floor(start / 2.0);
        }
        return str.toString();
    }

    private static int sumOfNumber(int numb) {
        int sum = 0;
        for (int i = 1; i < numb + 1; i *= 2) {
            if (sum > numb - 1) {
                break;
            } else {
                sum += i;
            }
        }
        return sum;
    }

}
