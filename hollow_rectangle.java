/*  *****
    *   *
    *   *
    *****
 */
import java.util.Scanner;
public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        //System.out.print("Enter number of columns: ");
        //int m = X.nextInt();
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n) {
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
