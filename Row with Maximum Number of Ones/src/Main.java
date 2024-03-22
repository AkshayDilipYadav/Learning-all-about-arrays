import java.util.Scanner;
public class Main {

    public static int maxOnesRow (int [][] A){
        int n = A.length;
        int m = A[0].length;
        int maxOnesRowIndex = 0;
        int i = 0, j = m-1;

        while (i < n && j >= 0){
            if (A[i][j] == 1){maxOnesRowIndex = i; j--;}
            else {i++;}
        }
        return maxOnesRowIndex;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] A = new int [n][m];
        for (int i = 0; i< n; i++){
            for (int j = 0; j < m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int maxOnes = maxOnesRow(A);
        System.out.println(maxOnes);

    }
}