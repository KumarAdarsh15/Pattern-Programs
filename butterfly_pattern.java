/*
 *      *
 **    **
 ***  ***
 ********
 ********
 ***  ***
 **    **
 *      *
 */
import java.util.Scanner;
public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= X.nextInt();
        int spaces;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            spaces=2*(n-i);
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
