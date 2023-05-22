/*
12345
  2345
   345
    45
     5
    45
   345
  2345
 12345
 */
import java.util.Scanner;
public class inverted_double_triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=n;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i=n-1;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<=n;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
