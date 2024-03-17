import java.util.Scanner;

public class Main {
    public int[] plusOne(int[] A) {
        int n = A.length;

        int leadingZeroes = 0;
        while (leadingZeroes < n && A[leadingZeroes] == 0) {
            leadingZeroes++;
        }

        if (leadingZeroes == n) {
            return new int[]{1};
        }

        int[] modifiedArray = new int[n - leadingZeroes];
        System.arraycopy(A, leadingZeroes, modifiedArray, 0, n - leadingZeroes);

        modifiedArray[n - leadingZeroes - 1]++;

        for (int i = n - leadingZeroes - 1; i > 0; i--) {
            if (modifiedArray[i] == 10) {
                modifiedArray[i] = 0;
                modifiedArray[i - 1]++;
            } else {
                break;
            }
        }

        if (modifiedArray[0] == 10) {
            int[] result = new int[modifiedArray.length + 1];
            result[0] = 1;
            return result;
        }

        return modifiedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        Main mainObj = new Main();
        int[] result = mainObj.plusOne(A);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}