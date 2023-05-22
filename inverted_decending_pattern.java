/*
7654321
765432
76543
7654
765
76
7
 */
import java.util.Scanner;
public class inverted_decending_pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= scan.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
