/*  ****
    ***
    **
    *
 */
import java.util.Scanner;
public class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

