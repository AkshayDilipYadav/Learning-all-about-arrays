import java.util.Scanner;

public class Main {

    public static int trapWater(int[] A) {
        int n = A.length;
        if (n <= 2) {
            return 0;
        }
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left < right) {
            if (A[left] < A[right]) {
                if (A[left] >= leftMax) {
                    leftMax = A[left];
                } else {
                    water += leftMax - A[left];
                }
                left++;
            } else {
                if (A[right] >= rightMax) {
                    rightMax = A[right];
                } else {
                    water += rightMax - A[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] elevationMap = new int[size];
        for (int i = 0; i < size; i++){
            elevationMap[i] = sc.nextInt();
        }
        System.out.println(trapWater(elevationMap));
    }
}