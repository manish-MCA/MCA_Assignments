
import java.util.Scanner;

public class ArrayIndexDemo {
    
    // Method that will cause the exception
    public static void causeException() {
        System.out.println("Trying to cause an error...");
        Scanner scanner = new Scanner(System.in);
        
        // Create a small array of names
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        
        System.out.println("We have " + names.length + " names in the array");
        System.out.println("Positions: 0, 1, 2, 3");
        
        // This will cause error - trying to access position that doesn't exist
        String name = names[10];  // 10 is too big for our array!
        System.out.println("The name at position 10 is: " + name);
    }
    
    // Method that handles the exception
    public static void handleException() {
        System.out.println("Trying to handle the error...");
        Scanner scanner = new Scanner(System.in);
        
        // Create a small array of names
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        
        System.out.println("We have " + names.length + " names in the array");
        System.out.println("Positions: 0, 1, 2, 3");
        
        try {
            // This might cause error - position doesn't exist
            String name = names[10];  // 10 is too big for our array!
            System.out.println("The name at position 10 is: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! We got an ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("You tried to access a position that doesn't exist in the array!");
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
