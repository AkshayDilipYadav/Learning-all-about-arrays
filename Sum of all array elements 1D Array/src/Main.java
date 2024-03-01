import java.util.*;
public class Main{

    public static int sumElements(int [] A){
        int sum = 0;
        for (int i = 0; i<A.length; i++){
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int [] A = new int [N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<N; i++){
            A[i]= sc.nextInt();
        }
        // calling for the function sumElements
int sum = sumElements(A);
        System.out.println("The total sum of the array is "+sum);
    }
}