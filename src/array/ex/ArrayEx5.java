package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        String[] productNames = new String[max];
        int[] productPrices = new int[max];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int choice = sc.nextInt();



            if (choice == 1) {
                if (productCount >= max) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품명을 입력하세요: ");
                productNames[productCount] = sc.next();

                System.out.print("가격을 입력하세요: ");
                productPrices[productCount] = sc.nextInt();

                productCount++;
            } else if (choice == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        }
    }
}
