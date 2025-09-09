import java.util.*;
// Take a number and print factorial using do-while.
public class Q14 {
    Scanner sc = new Scanner(System.in);

    public void factorial(){
        System.out.println("Enter Your Number for Factorial : ");

        int num = sc.nextInt();
        int output = 1;

        do{
            output = output * num;
            num--;
        }while(num > 0);

        System.out.println("THe total : "+ output);
    }

    public static void main(String[] args) {
        Q14 q = new Q14();

        q.factorial();
    }
}
