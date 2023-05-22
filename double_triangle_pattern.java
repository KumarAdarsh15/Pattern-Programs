/*
12345
1234
123
12
1
12
123
1234
12345
 */
import java.util.Scanner;
public class double_triangle_pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int k=2;k<=n;k++){
            for(int l=1;l<=k;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
