/*
1234567
2345671
3456712
4567123
5671234
6712345
7123456
 */
import java.util.Scanner;
public class square_pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(j);
            }
            for (int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
