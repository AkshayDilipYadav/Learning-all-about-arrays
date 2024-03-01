
import java.util.Scanner;
public class Main {
    public static int findFrequency(int[] A, int B){
int count = 0;
for (int i = 0; i <A.length; i++){
    if (A[i] == B){count++;}
}return count;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N  = sc.nextInt();
        // element to be searched
        int B = sc.nextInt();
        // declaring the 1D Array
        int[] A = new int [N];
// entering the values of 1D Array
        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }
int freq = findFrequency(A, B);
        System.out.println(freq);
    }
}