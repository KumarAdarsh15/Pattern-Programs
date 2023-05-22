import java.util.Scanner;
public class Tower_Hanoi {
    static void tower_hanoi(int n,String S,String H,String D){
        if(n==1){
            System.out.println("Transfer of disk "+n+" from "+S+" to "+D);
            return;
        }
        tower_hanoi(n-1,S,D,H);//when bigger disk is transferred to the destination and rest is in the helper tower
        System.out.println("Transfer of disk "+n+" from "+S+" to "+D);
        tower_hanoi(n-1,H,S,D);//when rest of disk is transferred to destination tower
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        tower_hanoi(n,"Source","Helper","Destination");
    }
}
