import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int minCostToRemove(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            totalCost += A[i] * (n - i);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minCostToRemove(arr));
    }
}