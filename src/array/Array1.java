package array;

public class Array1 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int i = 1;

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = i++;
            }
        }


        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
