package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값: "+ avg(55, 92, 1248));
    }

    public static double avg (int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
