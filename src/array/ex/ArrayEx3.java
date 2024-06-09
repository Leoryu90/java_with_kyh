package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        String[] sub = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 전수를 입력해주세요.");
            for (int j = 0; j < 3; j++) {
                System.out.print(sub[j] + "점수: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i  = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += arr[i][j];
            }
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + (total / (double) sub.length));
        }
    }
}
