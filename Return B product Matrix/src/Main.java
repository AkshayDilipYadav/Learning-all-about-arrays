import java.util.Scanner;

public class Main {

    public int[][] BProductMatrix(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] * B;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();

        Main mainObj = new Main(); // Create an instance of Main
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
        int[][] result = mainObj.BProductMatrix(A, B);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("(" + i + "," + j + ")");
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}