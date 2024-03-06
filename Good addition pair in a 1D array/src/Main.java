import java.util.Scanner;


public class Main {

    public static void goodAddPair(int [] A, int B){
        int N = A.length;
        int pair = 0;
        int count=0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                pair = A[i] + A[j];
                if (pair == B) {System.out.println(A[i]+","+A[j]);
                    count = count + 1;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B =  sc.nextInt();

        int [] A= new int [N];
        for (int i = 0; i <N; i++){
            A[i]=sc.nextInt();
        }
        goodAddPair(A, B);

    }

}
