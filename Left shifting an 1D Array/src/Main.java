import java.util.Scanner;
public class Main{

    public static int[] LeftSortedArray(int [] A){
int temp = A[0];

        for (int i = 1; i<A.length; i++){
            A[i-1]=A[i];
        }
        A[A.length - 1]=temp;

        return A;

    }
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();

        int[] A = new int [N];

        for (int i = 0; i<N; i++){
            A[i]=sc.nextInt();
        }

        int [] B = LeftSortedArray(A);
        for (int i = 0; i< B.length; i++){
            System.out.print(B[i]+ " ");
        }
    }
}
