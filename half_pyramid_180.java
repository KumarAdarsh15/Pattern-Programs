/*      *
       **
      ***
     ****
 */
import java.util.Scanner;
public class half_pyramid_180 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
