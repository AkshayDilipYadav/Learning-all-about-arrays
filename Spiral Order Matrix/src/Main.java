import java.util.Scanner;

public class Main {

    public static int [][] generateSpiralMatrix(int A){
        int [][] matrix = new int [A][A];
        int num =1;
        int topRow =0, bottomRow = A-1, leftColumn =0, rightColumn= A-1;
        int t= A*A;
        while (t>=0){
            for (int i = leftColumn; i <= rightColumn; i++){matrix [topRow][i] = num++;} topRow++; t--;
            for (int i = topRow; i <= bottomRow; i++){matrix [i][rightColumn] = num++;} rightColumn--; t--;
            for (int i = rightColumn; i >= leftColumn; i--){matrix [bottomRow][i] = num++;} bottomRow--; t--;
            for (int i = bottomRow; i >= topRow; i--){matrix [i][leftColumn] = num++;} leftColumn++; t--;

        }
        return matrix;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int [][] result = generateSpiralMatrix(A);
        for (int i =0; i < A; i++){
            for (int j =0; j < A; j++){
                System.out.print(result[i][j] + "," + " ");
            }
            System.out.println();
        }
    }
}