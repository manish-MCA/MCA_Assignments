import java.util.*;
public class Q2 {
    Scanner sc = new Scanner(System.in);

    // Take two numbers as input and print their sum, difference, product, and quotient.

    public void basicMaths(){
        System.out.println("Enter  two Integer Values : ");

        System.out.println("Enter  Value of Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter  Value of Number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("The SUM of two Numbers are : " + (num1 + num2));
        System.out.println("The DIFFERENCE of two Numbers are : " + (num1 - num2));
        System.out.println("The PRODUCT of two Numbers are : " + (num1 * num2));
        System.out.println("The QUOTIENT of two Numbers are : " + (num1 / num2));

    }

    public static void main(String[] args) {
        System.out.println("Basic Maths Function Performed : ");

        Q2 q = new Q2();

        q.basicMaths();
    }
}
