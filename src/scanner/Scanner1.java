package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력해주세요: ");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
