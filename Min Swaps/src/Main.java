import java.util.Scanner;

public class Main {

    public static int minSwaps(int[] A, int B) {
        int n = A.length;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            if (A[i] <= B) {
                maxCount++;
            }
        }

        int swaps = count - maxCount;

        for (int i = count; i < n; i++) {
            if (A[i - count] <= B) {
                maxCount--;
            }
            if (A[i] <= B) {
                maxCount++;
            }
            swaps = Math.min(swaps, count - maxCount);
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int minSwap = minSwaps(A, B);
        System.out.println(minSwap);
    }
}