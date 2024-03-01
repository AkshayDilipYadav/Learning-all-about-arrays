
import java.util.Scanner;
public class Main {

    public static boolean isNonDecreasing(int[] A){
        for (int i = 1; i<A.length; i++){
            if (A[i]<A[i-1]){
                return false;
            }
        }return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int []A= new int[N];
        for (int i = 0; i < N; i++){
            A[i]= sc.nextInt();
        }

        boolean ans = isNonDecreasing(A);
        System.out.print(ans);

    }
}