import java.util.Scanner;

public class Main {

    public static int antiDiagonalSum(int[][] A) {
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i][n - i - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + i + "," + j + ")");
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int diagonalSum = antiDiagonalSum(A);
        System.out.print(diagonalSum);
    }
}