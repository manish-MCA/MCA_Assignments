import java.util.*;
// Take a number as input and print whether it is even or odd.
public class Q3 {
    Scanner sc = new Scanner(System.in);
    public void evenOrOdd(){
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("Its an EVEN Number");
        }else{
            System.out.println("Its an ODD Number");
        }
    }
    public static void main(String[] args) {
        Q3 q = new Q3();
        q.evenOrOdd();
    }
}
