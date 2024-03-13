import java.util.Scanner;
public class Main {
    public static int [][] antiDiagonals(int [][] A){
        int n = A.length;
        int [][] result = new int [2* n-1][n];
        for (int d = 0; d < n; d++){
            int r = 0; int c = d;
            int index =0;
            while(c >= 0){
                result[d][index] = A[r][c];
                r++;
                c--;
                index++;
            }
        }
        for (int d  = n; d < 2* n -1; d++){
            int r = d - n +1;
            int c = n-1;
            int index =0;
            while (r < n){
                result[d][index] = A[r][c];
                r++;
                c--;
                index++;
            }
        }
        return result;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int [][]A = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){A[i][j] = sc.nextInt();}


        }
        for (int i=0; i<n; i++){
            for (int j =0; j<n; j++){ System.out.print("("+i+","+j+")");
                System.out.print(A[i][j]+ " ");
            } System.out.println();
        }

        System.out.println();
        int [][] result = antiDiagonals(A);

       for (int i = 0; i< result.length; i++){
           for (int j = 0; j < result[i].length; j++){
               System.out.print(result[i][j]+ " ");
           }
           System.out.println();
       }

    }
}