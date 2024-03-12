import java.util.Scanner;

public class Main {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int minSum = sum;
        int minIndex = 0;

        for (int i = B; i < n; i++) {
            sum += A[i] - A[i - B];
            if (sum < minSum) {
                minSum = sum;
                minIndex = i - B + 1;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        Main mainObj = new Main();
        System.out.print(mainObj.solve(A, B));
    }
}