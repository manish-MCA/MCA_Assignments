import java.util.Scanner;

public class SimpleStringIndexDemo {
    
    // Method that will cause the exception
    public static void causeException() {
        System.out.println("Trying to cause an error...");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a short word: ");
        String word = scanner.nextLine();
        
        System.out.println("Your word is: " + word);
        System.out.println("Word length: " + word.length());
        
        // This will cause error - trying to access position that doesn't exist
        char letter = word.charAt(10);  // 10 is too big for most words!
        System.out.println("The 11th letter is: " + letter);
    }
    
    // Method that handles the exception
    public static void handleException() {
        System.out.println("Trying to handle the error...");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter another short word: ");
        String word = scanner.nextLine();
        
        System.out.println("Your word is: " + word);
        System.out.println("Word length: " + word.length());
        
        try {
            char letter = word.charAt(10);  // 10 is too big for most words!
            System.out.println("The 11th letter is: " + letter);
        } catch (Exception e) {
            System.out.println("Oops! We got an error: " + e.getMessage());
            System.out.println("Your word is too short to have an 11th letter!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Program Start ===");
        
        // First, cousing the exeptopn
        causeException();
        
        System.out.println("=== Now let's try handling it ===");
        
        // Now hanfling the exception
        handleException();
        
        System.out.println("=== Program End ===");
    }
}