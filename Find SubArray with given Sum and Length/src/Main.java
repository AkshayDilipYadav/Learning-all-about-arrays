import java.util.Scanner;

public class Main {

    public int findSubarrayWithSumLength(int[] A, int B, int C) {
        int n = A.length;
        int windowSum = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            windowSum += A[i];
            if (i - start + 1 > B) {
                windowSum -= A[start];
                start++;
            }
            if (i - start + 1 == B && windowSum == C) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        Main mainObj = new Main();
        System.out.print(mainObj.findSubarrayWithSumLength(A, B, C));
    }
}