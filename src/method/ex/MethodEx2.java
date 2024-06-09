package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMore("이거 반복합니다.", 6);
    }

    public static void printMore (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}
