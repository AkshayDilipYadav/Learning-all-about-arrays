import java.util.*;
public class Main {

    public int[] countEvenNumbers(int[] A, int [][] B){
        int n= A.length;
        int m = B.length;

        int [] cumulativeEvenCount = new int [n];

        if (A[0] % 2 == 0){
            cumulativeEvenCount[0] = 1;
        }
        else {cumulativeEvenCount[0] = 0;}

        for (int i =1;i < n; i++){
        if (A[i]% 2 == 0) {   cumulativeEvenCount[i] = cumulativeEvenCount[i-1]+1;}
        else { cumulativeEvenCount[i] = cumulativeEvenCount[i-1];}
        }
        int [] queryCounts = new int [m];
        for (int i = 0; i < m; i++) {
            int l = B[i][0];
            int r = B[i][1];
            int evenCountInRange;
            if (l > 0){evenCountInRange = cumulativeEvenCount[r] - cumulativeEvenCount[l -1]; }
            else {evenCountInRange = cumulativeEvenCount[r];}
            queryCounts[i] = evenCountInRange;
        }

        return queryCounts;

    }
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int [] A = new int [n];
        for (int i =0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [][] B  = new int [m][2];
        for (int i = 0; i < m; i++){
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        Main mainObj = new Main();
        int [] result = mainObj.countEvenNumbers(A, B);

        for (int i =0; i < m; i++){
            System.out.print (result[i]+ " ");
        }
    }
}