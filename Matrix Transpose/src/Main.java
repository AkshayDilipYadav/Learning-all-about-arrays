import java.util.Scanner;

public class Main{


    public static void matTranspose (int [][] A){
       int N= A.length;
       int M = A[0].length;


        for (int j=0; j<M; j++){
            for (int i = 0; i<N; i++){ System.out.print("("+i+","+j+")");
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] A= new int [N][M];

        for (int i=0; i<N; i++){
            for (int j =0; j<M; j++){
                A[i][j]= sc.nextInt();

            }
        }

        for (int i=0; i<N; i++){
            for (int j =0; j<M; j++){ System.out.print("("+i+","+j+")");
            System.out.print(A[i][j]+ " ");
            } System.out.println();
        }

        System.out.println();System.out.println();System.out.println();

        matTranspose(A);

    }

}