import java.util.Scanner;

public class Main {

    public static void max2DArray( int [][] A){
        int N=A.length;
        int M=A[0].length;
        int max= Integer.MIN_VALUE;
        for (int i = 0;i<N;i++){
            for(int j=0;j<M;j++){
                if (A[i][j]>max){max=A[i][j];}
            }
        }
        System.out.print(max);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] A= new int [N][M];
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                A [i][j]=sc.nextInt();
            }
        }
        max2DArray(A);
    }
}