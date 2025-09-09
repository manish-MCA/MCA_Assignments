import java.util.*;

public class Q4 {
    Scanner sc = new Scanner(System.in);

    public void areaOfCircle(){
        System.out.println("Enter the Radius to Find the Area of Circle : ");
        int radius = sc.nextInt();
        //  Area = π * radius^2.
        double area = 3.14 * radius * radius;

        System.out.println("Area of the Circle is  : "+area);
    }
    public static void main(String[] args) {
        Q4 q = new Q4();
        q.areaOfCircle();
    }
}
