import java.util.*;
// Take an integer and check whether it is divisible by both 3 and 5 using a ternary operator
public class Q10 {
    Scanner sc = new Scanner(System.in);
    public void isDivisible(){
        System.out.println("Enter the Number for Checking if the number id Divisible by 3 and 5  : ");

        int num = sc.nextInt();

        System.out.println(
            (num % 3 == 0 && num % 5 == 0 ) ? 
            "YES, Number is divisible by both 3 and 5": 
            "No, its not divisible by both 3 and 5"
            );
    }

    public static void main(String[] args) {
        Q10 q = new Q10();

        q.isDivisible();
    }
}
