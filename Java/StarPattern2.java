package LOOPS;
import java.util.Scanner;
//Q.To print *
//           * *
//           * * *
//           * * * *
public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = 5;
        for (int i=0;i<=n;i++){
            for( int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
