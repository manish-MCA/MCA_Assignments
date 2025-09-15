import java.util.Scanner;

public class NumberFormatDemo {
    
    // Method that will cause the exception
    public static void causeException() {
        System.out.println("Trying to cause an error...");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text (not numbers): ");
        String text = scanner.nextLine();
        
        System.out.println("You entered: " + text);
        
        // This will cause error - trying to convert text to number
        int number = Integer.parseInt(text);  // Error if text has letters!
        System.out.println("The number is: " + number);
    }
    
    // Method that handles the exception
    public static void handleException() {
        System.out.println("Trying to handle the error...");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text (can be numbers or letters): ");
        String text = scanner.nextLine();
        
        System.out.println("You entered: " + text);
        
        try {
            // This might cause error if text has letters
            int number = Integer.parseInt(text);  // Try to convert to number
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Oops! We got a NumberFormatException: " + e.getMessage());
            System.out.println("You entered text that cannot be converted to a number!");
        } catch (Exception e) {
            System.out.println("Some other error happened: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Program Start ===");
        
        // First, let's cause the exception
        causeException();
        
        System.out.println("=== Now let's try handling it ===");
        
        // Now let's handle the exception
        handleException();
        
        System.out.println("=== Program End ===");
    }
}