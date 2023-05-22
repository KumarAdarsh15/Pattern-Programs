/*
 *****
 *  *
 * *
 **
 *
 */
import java.util.Scanner;
public class hollow_inverted_half {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
