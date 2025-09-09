import java.util.*;
// Write a program to calculate the square and cube of a number using the * operator.
public class Q5 {
    Scanner sc = new Scanner(System.in);

    public void squareAndCube(){
        System.out.println("Enter a Number for its Square and Cube : ");
        int num = sc.nextInt();
        
        System.out.println("The Square root of the Number is : "+((int)Math.pow(num, 2)));
        System.out.println("The Cube of the Number is : "+((int)Math.pow(num, 3)));
    }
    public static void main(String[] args) {
        Q5 q = new Q5();
        q.squareAndCube();
    }
}
