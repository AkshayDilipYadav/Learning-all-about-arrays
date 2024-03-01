import java.util.Scanner;
public class Main {

    public static int countBigNum (int []A, int B){
        int Count = 0;
        for (int i = 0; i <A.length; i++){
            if (A[i]>B){Count++;}
        }
        return Count;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N  = sc.nextInt();
        int B  = sc.nextInt();
        int [] A = new int [N];
        for (int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int num = countBigNum (A, B);
                System.out.println(num);

    }
}