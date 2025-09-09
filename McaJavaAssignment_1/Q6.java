import java.util.*;;
// Take three numbers as input and find the largest using logical operators (&&).
public class Q6 {
    Scanner sc = new Scanner(System.in);

    public void greaterNumberWithlogicalOperator(){
        System.out.println("Enter the Three Numbers  : ");

        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number : " + num1 + " is the Greater");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Number : " + num2 + " is the Greater");
        }else{
            System.out.println("Number : " + num3 + " is the Greater");
        }

    }

    public static void main(String[] args) {
        Q6 q = new Q6();


        q.greaterNumberWithlogicalOperator();
    }
}
