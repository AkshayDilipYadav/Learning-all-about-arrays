import java.util.Scanner;
public class Main {

    public int countSubarrays(int [] A){
        final int MOD = 1000000007;
        int n = A.length;
        long count =0;
        int [] lastOccurrence = new int [1000001];
        int start =0;
        for (int end =0; end< n; end++){
            int element = A[end];
            start = Math.max(start, lastOccurrence[element]);
            int length = end - start + 1;

            count = (count + length)% MOD;

            lastOccurrence[element] = end +1;
        }
        return (int) count;
    }
    public static void main (String[] args){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();

int [] A = new int[n];
for (int i = 0; i < n; i++){
    A[i] = sc.nextInt();
}

        Main mainObj = new Main();
        System.out.println(mainObj.countSubarrays(A));
    }
}