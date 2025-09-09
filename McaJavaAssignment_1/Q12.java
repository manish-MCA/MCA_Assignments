import java.util.*;
// Print the sum of digits of a given number using while
public class Q12 {
    Scanner sc = new Scanner(System.in);

    public void digitSum(){

        System.out.println("Enter a Digit Example(1234) : ");

        int num = sc.nextInt(); // 1234
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;

            sum += digit; //4 + 3 + 2 + 1

            num /= 10;
        }

        System.out.println("Sum of the Digit is : " + sum);
    }

    public static void main(String[] args) {
        Q12 q = new Q12();

        q.digitSum();
    }
}
