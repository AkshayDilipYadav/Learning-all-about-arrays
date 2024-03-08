//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static int maxMinSum (int [] A) {
        if (A.length == 0){return 0;}
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =0; i<A.length; i++){
            int num = A[i];
            if (num < min){ min = num;}
            else if(num > max){ max= num;}
        }
        return max + min;
    }
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int N = sc.nextInt();
int [] A = new int [N];
for (int i=0; i< N; i++){
    A[i] = sc.nextInt();
}
int result = maxMinSum(A);
System.out.print(result);
    }
}