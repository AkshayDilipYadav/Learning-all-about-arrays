import java.util.Scanner;
public class Main {

    public static int sumOfSubMatrices(int [][] A){
        int n = A.length;
        int sum =0;
        for (int i =0; i<n; i++){
            for (int j = 0; j<n; j++){
                sum += A[i][j] * (i+1) * (j+1) * (n-i)* (n-j);
            }
        }
        return sum;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [][] A = new int [n][n];
        for (int i = 0; i < n; i++){
            for (int j =0; j <n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int sum = sumOfSubMatrices(A);
        System.out.println(sum);
    }
}