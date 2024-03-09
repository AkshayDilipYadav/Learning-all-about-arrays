import java.util.Scanner;

public class Main {

    public int equilibriumIndex(int [] A) {
        int n = A.length;
        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int lSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= A[i];
            if (lSum == totalSum) {
                return i;
            }
            lSum += A[i];
        }

    return -1;

    }
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int [] A = new int [n];
        for (int i = 0; i< n ; i++){
            A[i] = sc.nextInt();
        }
        Main mainObj = new Main();
        int result = mainObj.equilibriumIndex(A);
if (result != -1){System.out.println (result);}
else {System.out.println(" No equilibrium index found");}
    }
}