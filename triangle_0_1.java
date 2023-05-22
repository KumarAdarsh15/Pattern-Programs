/*  1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
import java.util.Scanner;
public class triangle_0_1 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
               if(sum%2==0){
                   System.out.print("1 ");
               }
               else{
                   System.out.print("0 ");
               }
            }
            System.out.println();
        }
    }
}