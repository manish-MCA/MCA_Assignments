import java.util.*;
public class Q1 {
// // Write a program to take a user’s name and age as input and print: "Hello , you are years
// old.
    Scanner sc = new Scanner(System.in);
    public void inputValue(){
        System.out.println("Enter Your Name ");
        String name  = sc.next();

        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        System.out.println("Hello " + name +" you are "+age +" years Old");
    }
        public static void main(String[] args) {
        Q1 q = new Q1();
        q.inputValue();
    }
}