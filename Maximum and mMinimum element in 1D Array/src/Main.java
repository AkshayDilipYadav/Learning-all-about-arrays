import java.lang.*;
import java.util.*;
public class Main{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] A = new int [N];

        for (int i = 0; i<N; i++){
            A[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<A.length; i++){
            int num = A[i];
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println (max);
        System.out.println (min);
    }
}