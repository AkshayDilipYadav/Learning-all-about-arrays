//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static int findSecondLargest (int [] A){
        if (A.length < 2){return -1;}
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int n = A.length;
        for (int i = 0; i < n; i++){
            int num = A[i];
            if (num > largest){
                secondLargest = largest;
            largest = num;
            }
            else if (num> secondLargest && num != largest){secondLargest = num;}

        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N  = sc.nextInt();
        int[] A = new int [N];
        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }
        int result  = findSecondLargest(A);
        System.out.print(result);
    }
}