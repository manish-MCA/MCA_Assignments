import java.util.*;
// // Take marks as input and print the grade using if-else: (90+ → A, 75–89 → B, 50–74 → C,
// below 50 → Fail)
public class Q7 {
    Scanner sc = new Scanner(System.in);

    public void grades(){
        System.out.println("Enter Your Total Marks");

        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Your Grade is :  A");
        }else if (marks >= 75 && marks <= 89){
            System.out.println("Your Grade is :  B");
        }else if (marks >= 50 && marks <= 74){
            System.out.println("Your Grade is :  C");
        }else{
            System.out.println("You are FAILED");
        }
    }

    public static void main(String[] args) {
        Q7 q = new Q7();

        q.grades();
    }
}
