import java.util.Scanner;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        String[] months = {"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days[1] = 29;
        }
        
        System.out.println("    " + months[month-1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        // Simple calendar - just show days
        for (int day = 1; day <= days[month-1]; day++) {
            System.out.printf("%2d ", day);
            if (day % 7 == 0) {
                System.out.println();
            }
        }
    }
}