/*  *****
    *****
    *****
    *****
*/
import java.util.Scanner;
public class solid_rectangle {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
