import java.util.Scanner;

public class Circle {
    Scanner sc = new Scanner(System.in);

    double radius;
    Circle(){
        this(2.0);
        System.out.println("From Default Constructor");
    }

    Circle(double radius){
        this.radius = radius;
         System.out.println("From Perameterized Constructor");
    }

    void getRadius(){
        System.out.println("Enter the Circle Radius ");
        radius = sc.nextDouble();
    }

    void areaOfRadius(){
         System.out.println("The Area of Circle : " + (Math.PI * radius * radius));
         return;
    }

    void showRadius(){
        System.out.println("Radius : "+ radius);
    }
    public static void main(String[] args) {
        Circle c = new Circle();
         c.getRadius();
        Circle c2 = new Circle(c.radius);
        c2.areaOfRadius();
        c2.showRadius();

       
    }
}
