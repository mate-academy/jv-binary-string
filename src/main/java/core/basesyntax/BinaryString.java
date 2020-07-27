package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String s = "";
        int a = 0;
        int k = value;
        while (k / 2 != 0) {
            a++;
            k = k / 2;
        }
        a++;
        int[] arr = new int[a];
        int i = a - 1;
        while (value / 2 != 0) {
            arr[i] = value % 2;
            value = value / 2;
            i--;
        }
        arr[i] = value;
        for (int j = 0; j < arr.length; j++) {
            s = s + Integer.toString(arr[j]);
        }

        return s;
    }
}
