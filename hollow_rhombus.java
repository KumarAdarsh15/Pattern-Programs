/*
     ****
    *  *
   *  *
  ****
 */
import java.util.Scanner;
public class hollow_rhombus {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = X.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if(i==1||i==n||k==1||k==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
