import java.util.Scanner;

public class Main {

    public int closestMinMax(int[] A){
        int n= A.length;
        if (n <= 1){
            return n;
        }
        int smallestSubarraySize = Integer.MAX_VALUE;
        int minValue = A[0];
        int maxValue = A[0];
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i<n; i++) {
            if (A[i] < minValue){
                minValue = A[i];
                minIndex = i;
            }
            if (A[i] > maxValue){
                maxValue = A[i];
                maxIndex = i;}
        }
        for (int i = 0; i< n; i++) {
            if (A[i] == minValue){minIndex = i;}
            if (A[i] == maxValue){maxValue = i;}
            smallestSubarraySize = Math.min (smallestSubarraySize, Math.abs(maxIndex - minIndex)+1);
        }
        return smallestSubarraySize;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int [] A = new int [n];

        for (int i = 0; i< n; i++){
            A[i] = sc.nextInt();
                    }

        Main mainObj = new Main();
        int result = mainObj.closestMinMax(A);
        System.out.print (result);
    }
}