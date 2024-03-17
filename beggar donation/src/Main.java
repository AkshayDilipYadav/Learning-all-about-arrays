import java.util.Scanner;


public class Main {
    public static int[] calculatePots(int A, int[][] B) {
        int[] pots = new int[A];
        for (int[] donation : B) {
            int L = donation[0] - 1;
            int R = donation[1] - 1;
            int P = donation[2];
            pots[L] += P;
            if (R + 1 < A) {
                pots[R + 1] -= P;
            }
        }
        for (int i = 1; i < A; i++) {
            pots[i] += pots[i - 1];
        }
        return pots;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int numDonations = sc.nextInt();
        int[][] B = new int[numDonations][3];
        for (int i = 0; i < numDonations; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[] result = calculatePots(A, B);


        for (int potAmount : result) {
            System.out.print(potAmount + " ");
        }
    }
}