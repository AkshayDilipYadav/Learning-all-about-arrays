import java.util.Scanner;
public class Main {

    public static int[] rotateNTimes(int []A, int n){
        int N = A.length;
        n = n%N;
        int [] result = new int[N];
        for (int i  = 0; i<N; i++){
            int newIndex = (i+n)%N;
result[newIndex] = A[i];
        }return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        int []A = new int [N];
        for (int i=0; i < N; i++){
            A[i] = sc.nextInt();
        }
       int [] result = rotateNTimes(A, n);
        for (int i =0; i < result.length; i++){
            int num = result[i];
            System.out.print (num + " ");
        }

    }
}