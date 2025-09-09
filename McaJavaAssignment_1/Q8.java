import java.util.*;
// Take a number as input and check if it is positive, negative, or zero.
public class Q8 {
    Scanner sc = new Scanner(System.in);

    public void positiveOrNegativeOrZero(){
        System.out.println("Enter Your Number for Check : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(" Your Number is Positive ");
        }else if (num < 0){
            System.out.println(" Your Number is Negative ");
        }else{
            System.out.println(" Your Number is Zero ");
        }
    }

    public static void main(String[] args) {
        Q8 q = new Q8();

        q.positiveOrNegativeOrZero();
    }
}
