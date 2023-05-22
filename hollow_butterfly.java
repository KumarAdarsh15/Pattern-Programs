/*
 *        *
 **      **
 * *    * *
 *  *  *  *
 *   **   *
 *   **   *
 *  *  *  *
 * *    * *
 **      **
 *        *
 */
import java.util.Scanner;
public class hollow_butterfly {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= X.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                if(l==1||l==i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                if(j==1||j==i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            int spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                if(l==1||l==i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
