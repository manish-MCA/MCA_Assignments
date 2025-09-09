import java.util.*;

public class Q2 {
Scanner sc = new Scanner(System.in);
    public void add(){
        System.out.println("Enter the Two Number for Addition");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Addition  : "+(num1+num2));
    }
    public static void main(String[] args) {
        Q2 q = new Q2();

        q.add();
    }
}
