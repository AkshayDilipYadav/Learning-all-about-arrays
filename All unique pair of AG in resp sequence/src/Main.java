import java.util.Scanner;
public class Main {

    public int seqPairAG(String A){
        final int MOD = 1000000007;
        int countA = 0;
        int countAG =0;
        char [] charArray = A.toCharArray();

        for (int i =0; i < charArray.length; i++){
            char c = charArray[i];
            if (c == 'A'){countA++;}
            else if (c == 'G'){countAG = (countAG + countA)% MOD;}
        }
        return countAG;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String A = sc.nextLine();


        Main mainObj = new Main();
        System.out.print(mainObj.seqPairAG(A));
    }
}