import java.util.Scanner;
public class Main {

    public static int findPosition (int [][] A, int B){
        int n = A.length;
        int m= A[0].length;
        int row =0, col = m-1;
        int smallestIdentifier = Integer.MAX_VALUE;
        while(row < n && col >=0){
            if (A[row][col]==B){int currentIdentifier = (row+1)*1009 + (col +1);
            smallestIdentifier = Math.min(smallestIdentifier, currentIdentifier);
                    col--;
            }
            else if (A[row][col] < B){row++;}
            else {col--;}
        }
        if (smallestIdentifier == Integer.MAX_VALUE){
            return -1;
        }
        else {return smallestIdentifier;}
    }
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int B  = sc.nextInt();
        int [][] A = new int [n][m];
        for (int i = 0; i<n; i++){
            for (int j =0; j <m; j++){
                A[i][j] = sc.nextInt();
            }
        }

        int position = findPosition(A, B);
        if (position != -1){System.out.println(position);}
        else {System.out.println(-1);}

    }
}