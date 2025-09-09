import java.util.*;

public class Q9 {
    Scanner sc = new Scanner(System.in);

    public void averageOfValues(){
        System.out.println("Enter the three Number for there Average : ");

        int a =sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();

        int averrage = (a+b+c) / 3;

        System.out.println("Average of three Number : "+averrage);


    }
    public static void main(String[] args) {
        Q9 q = new Q9();

        q.averageOfValues();
    }
}
