package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String res = "";
        int bitsAmount = 0;
        if (value == 0) {
            return "0";
        }
        while (Math.pow(2, bitsAmount) <= value) {
            bitsAmount++;
        }
        int tempRes = 0;
        for (int i = bitsAmount; i > 0; i--) {
            int valToCheck = (int)Math.pow(2, i - 1);
            if (valToCheck + tempRes <= value) {
                res += "1";
                tempRes += valToCheck;
            } else {
                res += "0";
            }
        }
        return res;
    }
}
