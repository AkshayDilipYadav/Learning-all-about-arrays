import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public int [][] allSubarrays(int[] A){
        int n= A.length;
        int totalSubarrays = (n*(n +1))/2;

        int [][] result = new int[totalSubarrays][];

        int index =0;
        for (int i =0; i < n; i++){
            for (int j = i; j < n; j++){
                int subarrayLength = j - i + 1;
                int [] subarray = new int [subarrayLength];
                for (int k =0; k < subarrayLength; k++) {
                    subarray[k] = A [i + k];
                }
                result[index++] = subarray;
            }
        }
        return result;
    }


    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();

        int [] A = new int [n];
        for (int i = 0; i <n; i++){
            A[i] = sc.nextInt();
        }


        Main mainObj = new Main();
        int[][] result = mainObj.allSubarrays(A);
for (int i = 0; i < result.length; i++){
    int [] subarray = result[i];
    System.out.println (Arrays.toString(subarray));
}
    }

        }