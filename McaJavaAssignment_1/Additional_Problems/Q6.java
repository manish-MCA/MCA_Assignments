import java.util.*;

public class Q6 {
    Scanner sc = new Scanner(System.in);
    public void simpleIntrest(){
        System.out.println("Enter the Principal : ");
        int principal = sc.nextInt();
        System.out.println("Enter the Rate : ");
        int rate = sc.nextInt();
        System.out.println("Enter the Time : ");
        int time = sc.nextInt();

        // Simple Interest = (Principal * Rate * Time) / 100.
        double interest = (principal * rate * time) / 100;

        System.out.println("The Total Intrest is : " + interest);
    }
    public static void main(String[] args) {
        Q6 q = new Q6();
        q.simpleIntrest();

    }
}
