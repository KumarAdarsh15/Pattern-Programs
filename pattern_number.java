/*
1
12
123
1234
12345
123456
1234567
123456
12345
1234
123
12
1
 */
import java.util.Scanner;
public class pattern_number {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int k=n-1;k>0;k--){
            for(int l=1;l<=k;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
