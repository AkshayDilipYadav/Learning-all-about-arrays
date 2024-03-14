import java.util.Scanner;

public class Main {
    public int maxSumSubArray(final int[] A) {
        int n = A.length;
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
        for (int i = 1; i < n; i++){
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++){
            A[i] = sc.nextInt();
        }
        Main main = new Main();
        System.out.println(main.maxSumSubArray(A));
    }
}