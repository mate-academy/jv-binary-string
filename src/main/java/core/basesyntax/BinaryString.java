package core.basesyntax;

public class BinaryString {
    public String toBinaryString(int value) {
        if (value == 0) {return "0";}
        StringBuilder valueSB = new StringBuilder();
        while (value != 0)
        {
            valueSB.append((value%2));
            System.out.print(value%2);
            value = value/2;
        }
        return valueSB.reverse().toString();
    }
}
