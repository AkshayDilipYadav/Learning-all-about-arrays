import java.util.*;
public class Main {

    public int[] subarrayFrombtoc (int[] A, int b, int c){
        int subarrayLength = c-b+1;
        int[] subarray = new int [subarrayLength];
         for (int i = 0; i< subarrayLength; i++){
             subarray[i] = A[b+i];

         }
         return subarray;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A  = new int [n];
        for (int i =0; i<n; i++){
            A[i]= sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        Main mainObj = new Main ();
        int[] result = mainObj.subarrayFrombtoc(A, b, c);
        System.out.print(Arrays.toString(result));
    }
}