/*
1111
222
33
4
 */
import java.util.Scanner;
public class inverted_number {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
