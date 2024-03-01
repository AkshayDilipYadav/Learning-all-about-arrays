import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        for (int i = 0; i <N; i++){
            A[i]= sc.nextInt();
        }
        int lastelement = A[N-1];
        for (int i = N-1; i>0; i--){
            A[i]= A[i-1];
        }
        A[0]= lastelement;
        for (int i = 0; i<N; i++){
            System.out.print(A[i]+ " ");
        }
            }
}