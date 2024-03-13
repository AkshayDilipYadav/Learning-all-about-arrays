import java.util.Scanner;

public class Main {

    public static int [] rowWiseSum(int [][] A){

        int n = A.length;
        int m = A[0].length;

        int [] rowSums = new int [n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                rowSums[i] += A[i][j];
            }
        }
        return rowSums;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]A = new int [n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){A[i][j] = sc.nextInt();}


        }
        for (int i=0; i<n; i++){
            for (int j =0; j<m; j++){ System.out.print("("+i+","+j+")");
                System.out.print(A[i][j]+ " ");
            } System.out.println();
        }

        System.out.println();System.out.println();System.out.println();
        int [] result = rowWiseSum(A);

        for (int i = 0; i < result.length; i++){
            System.out.println(i +" "+ "column" +" "+ result[i] + " ");
        }

    }
}