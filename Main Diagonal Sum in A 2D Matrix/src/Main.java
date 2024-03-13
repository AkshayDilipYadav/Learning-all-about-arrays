import java.util.Scanner;

public class Main {

    public static int mainDiagonalSum(int [][] A ){
        int sum = 0;
        int n = A.length;
        for (int i  = 0; i < n; i++){
            sum += A[i][i];
        }
        return sum;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int [][] A = new int [n][n];
        for (int i = 0; i< n; i++){
            for (int j = 0; j<n; j++){
                A [i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            for (int j =0; j<n; j++){ System.out.print("("+i+","+j+")");
                System.out.print(A[i][j]+ " ");
            } System.out.println();
        }

        System.out.println();
        int diagonalSum = mainDiagonalSum(A);
        System.out.print(diagonalSum);
    }
}