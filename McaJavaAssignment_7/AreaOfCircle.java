import java.util.*;
public class AreaOfCircle {
    Scanner sc = new Scanner(System.in);
    double r ;
    double Pi = Math.PI;
    double area,circumfrence;

    void getInput(){
        System.out.println("Enter The Radius of Circle : ");
        r = sc.nextDouble();
    }

    void areaOfCircle(){
        area = Math.round(Pi * r *r) ;
    }

    void circumfrenceOfCircle(){
        circumfrence = Math.round(2 * Pi * r);
    }

    void display(){
        System.out.println("The Area of Circle is : "+ area);
        System.out.println("The Circumference of Circle is : "+ circumfrence);
    }

    public static void main(String[] args) {
        AreaOfCircle a = new AreaOfCircle();
        a.getInput();
        a.areaOfCircle();
        a.circumfrenceOfCircle();
        a.display();

    }
}
