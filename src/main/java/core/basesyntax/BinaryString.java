package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String answer = "";
        int mult = 1;
        int num = 0;
        do {
            num += (value%2)*mult;
            value/=2;
            mult*=10;
        }while (value>0);

        answer = ""+ num;
        return answer;
    }
}
