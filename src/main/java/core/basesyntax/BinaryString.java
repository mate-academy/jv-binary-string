package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String result = "";
        if (value == 0) {
            return "0";
        }
        while (value > 0) {
            if (value % 2 == 0) {
                result = result + 0;
                value = value / 2;
            } else {
                result = result + 1;
                value = value / 2;
            }
        }
        String[] sum = result.split("");
        String fine = "";
        for (int i = 1; i <= sum.length;i++) {
            fine = fine + sum[sum.length - i];
        }
        return fine;
    }
}
