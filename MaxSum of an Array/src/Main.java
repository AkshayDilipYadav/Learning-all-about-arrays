import java.util.Scanner;
public class Main {

    public int maxSumSubarray (int A, int B, int[] C){
        int maxSum =0, currentSum =0;
        for (int left = 0, right = 0; right < A; right++){
            currentSum += C[right];
            while (currentSum > B && left <= right){
                currentSum -= C[left];
                left++;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main (String[] args){
         Scanner sc = new Scanner (System.in);
         int A = sc.nextInt();

         int B = sc.nextInt();

         int [] C =new int [A];

         for (int i =0; i < A; i++){
             C[i] = sc.nextInt();
         }

        Main mainObj = new Main();
        System.out.print(mainObj.maxSumSubarray(A, B, C));

    }
}