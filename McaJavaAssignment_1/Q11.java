import java.util.*;
// Print the multiplication table of a given number using for
public class Q11 {
    Scanner sc = new Scanner(System.in);

    public void multiplicationTable(){
        System.out.println("Enter the Number you want for Multiplication Table : ");

        int num = sc.nextInt();

        System.out.print("The Table of : "+num);
        for (int i = 0; i <= 10; i++) {
            System.out.println((num * i));
        }

    }

    public static void main(String[] args) {
        Q11 q = new Q11();

        q.multiplicationTable();
    }
}
