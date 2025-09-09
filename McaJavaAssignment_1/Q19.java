import java.util.*;
// Take a number and check if it is a palindrome (same forward and backward)
public class Q19 {
    Scanner sc = new Scanner(System.in);

    public void palindrome(){
        System.out.println("Enter the Number to Check Pallindrome");
        int OriginalNum = sc.nextInt();

        int num = OriginalNum;
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            rev = rev * 10 + lastDigit;

            num = num / 10;
        }
        System.out.println("Number : " +  rev);
        System.out.println("Original Number : " +  num);

        if (OriginalNum == rev) {
            System.out.println("Yes This Number is Pallindrome");
        }else{
            System.out.println("Yes This Number is not Pallindrome");
        }
    }

    public static void main(String[] args) {
        Q19 q = new Q19();
        q.palindrome();
    }
}
