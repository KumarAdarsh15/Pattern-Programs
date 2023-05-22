/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
 */
import java.util.Scanner;
public class pascal_triangle {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        int space=n,number=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            number = 1;
            for(int k=0;k<=i;k++){
                System.out.print(number+" ");
                number = number*(i-k)/(k+1);
                }
            space--;
            System.out.println();
            }
        }
    }
