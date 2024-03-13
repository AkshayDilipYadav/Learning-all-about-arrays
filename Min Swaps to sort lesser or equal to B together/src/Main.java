import java.util.Scanner;

public class Main {

    public int minSwapsTogether(int[] A, int B) {
        int count = 0;
        int n = A.length;
        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            if (num <= B) {
                count++;
            }
        }
        int currentCount = 0;
        for (int i = 0; i < count; i++) {

            if (A[i] <= B) {
                currentCount++;
            }
        }

        int minSwaps = count - currentCount;

        for (int i = count; i< n; i++){
            if (A[i - count] <= B){currentCount--;}
            if (A[i] <= B){currentCount++;}
            minSwaps = Math.min(minSwaps, count - currentCount);
        }
        return minSwaps;
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
        System.out.print(mainObj.minSwapsTogether(A, B));
    }
}