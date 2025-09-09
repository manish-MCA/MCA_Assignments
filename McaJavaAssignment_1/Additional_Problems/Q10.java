import java.util.*;

public class Q10 {
    Scanner sc = new Scanner(System.in);

    public void kilometerToMiles(){
        System.out.println("Enter the Kilometer : ");
        int kilometer = sc.nextInt();

        // Miles = Kilometers * 0.621371.
        double miles  = (kilometer * 0.621371);
        
        System.out.println("Miles : "+miles);
    }
    public static void main(String[] args) {
        Q10 q = new Q10();

        q.kilometerToMiles();
    }
}
