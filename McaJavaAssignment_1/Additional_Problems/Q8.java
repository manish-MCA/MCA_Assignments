import java.util.*;

public class Q8 {
    Scanner sc = new Scanner(System.in);

    public void baseIntoExponent(){
        System.out.println("Enter the Base Value : ");
        int base = sc.nextInt();
        System.out.println("Enter the Exponent Value : ");
        int exponent = sc.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println("Base to Exponent : " + result);

    }
    public static void main(String[] args) {
        
        Q8 q = new Q8();

        q.baseIntoExponent();
        
    }
}
