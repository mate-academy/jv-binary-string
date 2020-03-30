package core.basesyntax;

public class BinaryString {
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        int digit;
        for (int digitalNumber = value; digitalNumber > 0; digitalNumber /= 2) {
            digit = digitalNumber % 2;
            binaryNumber.append(digit);
        }
        return binaryNumber.reverse().toString();
    }
}
