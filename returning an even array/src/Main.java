import java.util.Scanner;

public class Main {

    public static int[] evenArray(int[] A){
        int count=0;
        for (int i = 0; i <A.length; i++){
            int num = A[i];
            if (num%2==0){ count++;}
        }
        int [] even = new int [count];
        int index = 0;
        for (int i =0; i< A.length; i++){
            int num = A[i];
            if (num%2==0){even[index++]=num;}

        } return even;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N  = sc.nextInt();
        int [] A = new int [N];
        for (int i = 0; i <N; i++){
            A[i]= sc.nextInt();
        }

         int [] even= evenArray(A);
for (int i = 0; i < even.length; i++){
    System.out.print(even[i]+ " ");
}

    }

}