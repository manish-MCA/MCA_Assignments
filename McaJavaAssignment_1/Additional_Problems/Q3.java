import java.util.*;

public class Q3 {
    Scanner sc = new Scanner(System.in);
    public void celciusToFahrenheit(){
        System.out.println("Enter the Tempreature in Celcious : ");

        Float cel = sc.nextFloat();

        float toFahrenheit = (cel * 9/5) + 32;

        System.out.println("Fahrenheit : "+ toFahrenheit);
    }
    public static void main(String[] args) {
        Q3 q = new Q3();

        q.celciusToFahrenheit();
    }
}
