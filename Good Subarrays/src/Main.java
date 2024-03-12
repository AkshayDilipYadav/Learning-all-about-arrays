import java.util.Scanner;
public class Main {

    public int findGoodSubarray(int [] A, int B){
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += A[j];
                if ((j - i +1)% 2 ==0 && sum < B){
                    count++;
                }
                if ((j - i +1)% 2 ==1 && sum > B){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] A = new int [n];
        for (int i =0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        Main mainObj = new Main();
        System.out.print(mainObj.findGoodSubarray(A, B));
    }
}