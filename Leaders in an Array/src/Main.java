import java.util.Scanner;

public class Main {

    public int[] findLeaders(int[] A){
        int n = A.length;
        int maxRight = Integer.MIN_VALUE;
        int leaderCount =0;
        for (int i = n-1; i>=0; i--){
            if (A[i]> maxRight){
                maxRight = A[i];
                leaderCount++;
            }
        }
        int [] leaders = new int [leaderCount];
        int leaderIndex = 0;
        maxRight = Integer.MIN_VALUE;
        for (int i = n-1; i >=0; i--){
            if (A[i]> maxRight){
                maxRight = A[i];
                leaders[leaderIndex++] = maxRight;
            }
        }
        return leaders;
    }
    public static void main (String[] args){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int [] A = new int [n];
for (int i = 0; i < n; i++){
    A[i] = sc.nextInt();
}
        Main mainObj = new Main();
        int [] leaders = mainObj.findLeaders(A);
for (int i = 0; i < leaders.length; i++){
    int leader = leaders[i];
    System.out.print (leader + " ");
}
    }
}