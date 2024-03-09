import java.util.*;

public class Main {

    public long[] rangeSumQuery(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] cumulativeSum = new long[n];
        cumulativeSum[0] = A[0];

        for (int i = 1; i < n; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + A[i];
        }

        long[] querySums = new long[m];

        for (int i = 0; i < m; i++) {
            int L = B[i][0];
            int R = B[i][1];

            long sum = cumulativeSum[R];
            if (L > 0) {
                sum -= cumulativeSum[L - 1];
            }
            querySums[i] = sum;
        }

        return querySums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[][] B = new int[m][2];

        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        Main mainObj = new Main();
        long[] result = mainObj.rangeSumQuery(A, B);

        for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
        }
    }
}