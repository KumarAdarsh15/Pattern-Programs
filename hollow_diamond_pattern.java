import java.util.Scanner;
public class hollow_diamond_pattern {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scan.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                if(k==1||k==(2*i-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=n;i>0;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++){
                if(k==1||k==(2*i-1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
