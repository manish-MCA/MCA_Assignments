import java.util.*;

public class Q7 {
    Scanner sc = new Scanner(System.in);

    public void perimeter(){
        System.out.println("Enter the Length : ");
        int length = sc.nextInt();
        System.out.println("Enter the Width : ");
        int width = sc.nextInt();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter : " + perimeter);
          
    }

    public static void main(String[] args) {
        Q7 q = new Q7();

        q.perimeter();
    }
}
