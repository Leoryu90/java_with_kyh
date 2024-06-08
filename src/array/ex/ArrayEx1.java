package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int sum = 0;

        for (int number : a){
            sum += number;
        }

        System.out.println("총 합계는 " + sum +"입니다");
        System.out.println("평균은 " + (sum / a.length)+"입니다");
    }
}
