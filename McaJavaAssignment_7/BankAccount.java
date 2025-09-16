import java.util.Scanner;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    String accountHolder;
    int accountNumber;
    double balance = 1000.0;


    double DepositeMoney(){
        System.out.println("Enter The money amount you Want to Deposite");

        double deposite =  sc.nextInt();

       return (balance +=deposite); 

    }

    void withdrawingMoney(){
        System.out.println("Enter The money amount you Want to Withdraw");
        double withdraw = sc.nextInt(); 
        if (withdraw < balance) {
           withdraw = (balance -=withdraw);
            return;
        }else{
            System.out.println("You Dont have Sufficient Balance ");
        }
        return;
    }


    void displayBalance(){
        System.out.println("Your Total Balance is :  "+balance+"rs");
    }
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.DepositeMoney();
        bk.withdrawingMoney();
        bk.displayBalance();
    }
}
