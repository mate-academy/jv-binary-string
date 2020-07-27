package core.basesyntax;

public class BinaryString {

    public String toBinaryString(int value) {
        StringBuilder response = new StringBuilder();
        while (value > 0) {
            response.append(value % 2);
            value /= 2;
        }
        response = response.length() == 0 ? new StringBuilder("0") : response;
        return response.reverse().toString();
    }
}
