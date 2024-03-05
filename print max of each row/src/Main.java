import java.util.Scanner;

public class Main {
    public static void maxRow(int [][] A){
        int N = A.length;
        int M = A[0].length;

        int [] ans = new int [N];

        for (int i =0; i<N; i++){   int max= Integer.MIN_VALUE;
            for (int j = 0; j<M; j++){
                if (A[i][j]>max){max = A[i][j];}
            }ans[i] = max;
        }

        for (int i =0; i<N; i++){
           System.out.print(ans[i]+ " ");
        }

    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int [][] A= new int [N][M];
        for (int i =0; i<N; i++){
            for (int j =0; j<M; j++){
            A[i][j]= sc.nextInt();
        }}
        maxRow(A);
    }
}