import java.util.Scanner;

public class Main {
    public int findSubarraySumLessB(int[] A, int B) {
        int n = A.length;
        int count = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += A[right];
            while (sum >= B && left <= right) {
                sum -= A[left++];
            }
            count += right - left + 1;
        }
        return count;
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
        System.out.print(mainObj.findSubarraySumLessB(A, B));
    }
}