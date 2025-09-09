import java.util.*;;
// Take two numbers as input and check which one is greater using the > operator
public class Q4 {
    Scanner sc = new Scanner(System.in);
    
    public void greaterNumber(){
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();

        if (num1 > num2  ) {
            System.out.println(num1 + " is Greater ");
        }else{
            System.out.println(num2 + " is Greater ");
        }
    }
    public static void main(String[] args) {
        Q4 q = new Q4();
        q.greaterNumber();
    }
}
