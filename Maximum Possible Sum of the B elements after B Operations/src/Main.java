import java.util.Scanner;
public class Main{

    public int maxPossSum (int [] A, int B){
        int n = A.length;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= B; i++){
            int sum = 0;
            for (int j = 0; j < i; j++){
                sum += A[j];
            }
            for (int j = n-1; j >= n - (B - i); j--){
                sum += A[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int [] A = new int [n];
        for (int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        Main mainObj = new Main();
        System.out.println(mainObj.maxPossSum(A, B));
    }
}