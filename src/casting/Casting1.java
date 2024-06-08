package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue;
        System.out.println(longvalue);
        doublevalue = intvalue;
        System.out.println(doublevalue);

        double n1 = 1.9;

        System.out.println((int) n1);

    }
}
