import java.util.*;

public class Q5 {
// Volume = π * radius^2 * height.
    public void volumeOfCylinder(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Height and Radius of Cylinder : ");
        int height = sc.nextInt();

        System.out.println("Enter Radius of Cylinder : ");
        int radius =  sc.nextInt();

        double vol = 3.14 * radius*radius *height;

        System.out.println("The Volume is : "+vol);

    }
    public static void main(String[] args) {
        Q5 q = new Q5();
        q.volumeOfCylinder();
    }
}
