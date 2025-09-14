package Level_3;

import java.util.Scanner;

public class CollinearPointsBasicMethods {

    // Method to check collinearity using area
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if (areCollinear(x1, y1, x2, y2, x3, y3)) 
            System.out.println("Points are collinear.");
        else 
            System.out.println("Points are not collinear.");

        
    }
}

