import java.util.*;
class Account{
    String name="Adarsh Kumar",acct_type;
    int acct_number=123456789;
    public double balance=50000,amount;
    void details(){
        System.out.println("\nAccount Holder name: "+name);
        System.out.println("Account Number: "+acct_number);
        System.out.println("Balance: "+balance+"\n");
    }
    void deposit(){
        balance=balance+amount;
        System.out.println("\nRs."+amount+" deposited");
        System.out.println("Updated Balance: Rs."+balance+"\n");
    }
    void withdraw(){
        if(balance<amount)
            System.out.println("\nInsufficient Balance\n");
        else{
            balance=balance-amount;
            System.out.println("\nRs."+amount+" withdrawn");
            System.out.println("Updated Balance: Rs."+balance+"\n");
        }
    }
}
class Sav_acct extends Account{
    void check_min_balance(){
        if(balance<500)
            System.out.println("\nNo service charge for saving account\n");
        else
            System.out.println("\nSufficient minimum balance\n");
    }
    double interest(){
        return balance*0.3;
    }
}
class Curr_acct extends Account{
    double min=5000,charge=500;
    void check_min_balance(){
        if(balance<min){
            balance=balance-charge;
            System.out.println("\nRs."+charge+" deducted (service charge).\nUpdated Balance: Rs."+balance+"\n");
        }
        else
            System.out.println("\nSufficient minimum balance\n");
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Account a=new Account();
        System.out.print("Enter account type(Saving or Current): ");
        a.acct_type= scan.next();
        if(a.acct_type.equalsIgnoreCase("saving")){
            System.out.println("\n...You are having a Saving Account...");
            Sav_acct s=new Sav_acct();
            while(true){
                System.out.println("Press 1 to check details");
                System.out.println("Press 2 to deposit money");
                System.out.println("Press 3 to withdraw money");
                System.out.println("Press 4 to check minimum balance status");
                System.out.println("Press 5 to calculate interest");
                System.out.println("Press 0 to exit");
                System.out.print("Enter your choice: ");
                int ch= scan.nextInt();
                switch (ch){
                    case 1 :
                        s.details();
                        break;
                    case 2 :
                        System.out.print("Enter amount to be deposited: ");
                        s.amount=scan.nextDouble();
                        s.deposit();
                        break;
                    case 3 :
                        System.out.print("Enter amount to be withdrawn: ");
                        s.amount = scan.nextDouble();
                        s.withdraw();
                        break;
                    case 4:
                        s.check_min_balance();
                        break;
                    case 5:
                        System.out.println("\nRs."+s.interest()+" interest");
                        System.out.println("Updated Balance: Rs." + (s.balance+s.interest())+"\n");
                        break;
                    case 0:
                        System.out.println("Thank You!");
                        System.exit(0);
                        break;
                    default : System.out.println("Out of bound");
                        break;
                }
            }
        }
        else if(a.acct_type.equalsIgnoreCase("current")){
            System.out.println("\n...You are having a Current Account...");
            Curr_acct c=new Curr_acct();
            while (true){
                System.out.println("Press 1 to check details");
                System.out.println("Press 2 to deposit money");
                System.out.println("Press 3 to withdraw money");
                System.out.println("Press 4 to check minimum balance status");
                System.out.println("Press 5 to calculate interest");
                System.out.println("Press 0 to exit");
                System.out.print("Enter your choice: ");
                int ch= scan.nextInt();
                switch (ch){
                    case 1 :
                        c.details();
                        break;
                    case 2 :
                        System.out.print("Enter amount to be deposited: ");
                        c.amount=scan.nextDouble();
                        c.deposit();
                        break;
                    case 3 :
                        System.out.print("Enter amount to be withdrawn: ");
                        c.amount=scan.nextDouble();
                        c.withdraw();
                        break;
                    case 4:
                        c.check_min_balance();
                        break;
                    case 5:
                        System.out.println("\nNo interest for current account\n");
                        break;
                    case 0:
                        System.out.println("Thank You!");
                        System.exit(0);
                        break;
                    default : System.out.println("Wrong choice");
                        break;
                }
            }
        }
        else
            System.out.println("Wrong choice!");
    }
}
