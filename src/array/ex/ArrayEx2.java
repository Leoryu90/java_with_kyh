package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max;

        System.out.println("입력할 정수의 갯수를 정해주세요");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("정수를 하나씩 입력해주세요.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        min = arr[0];
        max = arr[0];

        for (int i = 0; i < n; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
