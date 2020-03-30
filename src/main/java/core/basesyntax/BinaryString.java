package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        String result = "";
        while (value > 0) {
            result = result + value % 2;
            value = (value / 2);
        }
        StringBuilder itog = new StringBuilder(result);
        itog = itog.reverse();
        result = "" + itog;
        return result;

    }
}
