import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public int ifAPArray (int [] A){
        Arrays.sort(A);
        int diff = A[1] - A[0];
        for (int i =2; i < A.length; i++){
            if (A[i] - A[i-1] != diff){
                return 0;
            }
        }
        return 1;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] A = new int [n];
        for (int i =0; i < n; i++){
            A[i] = sc.nextInt();
        }
        Main mainObj = new Main();
        System.out.println( mainObj.ifAPArray(A));
    }
}