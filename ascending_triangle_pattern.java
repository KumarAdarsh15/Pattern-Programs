/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
import java.util.Scanner;
public class ascending_triangle_pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for (int i=1;i<=n;i++){
            int num=i;
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+n-j;
            }
            System.out.println();
        }
    }
}
