//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static int timeToEquality (int [] A){
        int n  = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n; i++){
            if (A[i]>max){max = A[i];}
        }
        int totalTime = 0;
        for (int i = 0; i <n; i++){
            totalTime = totalTime+ max - A[i];
        }
        return totalTime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N  = sc.nextInt();
        int[] A = new int [N];
        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }
        int result = timeToEquality (A);
        System.out.print (result);
    }
}