/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
 */
import java.util.Scanner;
public class digit_pillar_pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("1");
            }
            for (int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
