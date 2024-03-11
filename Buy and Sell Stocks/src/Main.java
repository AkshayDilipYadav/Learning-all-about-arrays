import java.util.Scanner;
public class Main {

    public int buySellStocks(int [] A){
        if (A == null || A.length <= 1){
            return 0;
        }
        int maxProfit = 0;
        int minPrice = A[0];

        for (int i = 1; i < A.length; i++){
            int profit = A[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, A[i]);
        }
        return maxProfit;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] A = new int [n];
        for (int i =0; i<n; i++){
            A[i] = sc.nextInt();
        }
        Main mainObj = new Main();
        System.out.println(mainObj.buySellStocks(A));
    }
}