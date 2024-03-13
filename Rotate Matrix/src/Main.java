import java.util.Scanner;
public class Main {

    public static int [][] rotateImage(int [][] A){
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
        return A;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [][] A = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int [][] rotatedImage = rotateImage(A);
        for (int i =0; i < rotatedImage.length; i++){
            for (int j =0; j < rotatedImage[i].length; j++){
                System.out.print(rotatedImage[i][j]+ " ");
            }
            System.out.println();
        }
    }
}