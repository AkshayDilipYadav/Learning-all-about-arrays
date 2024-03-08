//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static int oneElementGreater (int [] A){
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n; i++){
            boolean foundGreater  = false;
            for (int j =0; j <n; j++){
                if (i !=j && A[j]> A[i]){
                    foundGreater = true;
                    break;
                }
            }
            if (foundGreater){count++;}
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N  = sc.nextInt();
        int[] A = new int [N];
        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }
        int result  = oneElementGreater(A);
        System.out.print(result);
    }
}