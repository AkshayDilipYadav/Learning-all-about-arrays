import java.util.Scanner;
public class Main {

    public static int[] reverseRange (int []A, int B, int C){
        if (A == null || B<0 || C >= A.length || B>C){return A;}
        while (B<C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int B=  sc.nextInt();
        int C =  sc.nextInt();

        int [] A= new int [N];
        for (int i =0; i<N; i++){
            A[i]= sc.nextInt();
        }
        int [] result = reverseRange(A, B, C);
        for (int i =0; i < result.length; i++){
            int num = result[i];
            System.out.print (num + " ");
        }
    }
}