import java.util.Scanner;

public class Main {

    public int[] prefixSum(int[] A){
        int n = A.length;
        for (int i =1; i< n; i++){
            A[i] = A[i] + A[i-1];
        }
        return A;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i =0; i < n; i++){
            A[i]=sc.nextInt();
        }
        Main mainObj = new Main();
        int[] result = mainObj.prefixSum(A);

        for (int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }


    }
}