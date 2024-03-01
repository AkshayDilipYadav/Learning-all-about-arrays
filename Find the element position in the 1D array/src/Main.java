
import java.util.Scanner;
public class Main {
    public static int findElements (int [] A, int B){
        for (int i = 0; i<A.length; i++){
            if (A[i]==B){return i+1;}
        }return -1;
    }
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
int N  = sc.nextInt();
int [] A = new int [N];
int B  = sc.nextInt();
for (int i = 0; i<N; i++) {
    A[i] = sc.nextInt();
}
int find = findElements(A, B);
System.out.println(find);
    }
}