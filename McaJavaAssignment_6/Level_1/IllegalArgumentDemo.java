
import java.util.Scanner;

public class IllegalArgumentDemo {
    
    public static void causeException() {
        System.out.println("Trying to cause an error...");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("Your word is: " + word);
        System.out.println("Word length: " + word.length());
        
        String part = word.substring(5, 2);  // 5 is bigger than 2!
        System.out.println("Part of word: " + part);
    }
    
    // Method that handles the exception
    public static void handleException() {
        System.out.println("Trying to handle the error...");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter another word: ");
        String word = scanner.nextLine();
        
        System.out.println("Your word is: " + word);
        System.out.println("Word length: " + word.length());
        
        try {
            
            String part = word.substring(5, 2);  // 5 is bigger than 2!
            System.out.println("Part of word: " + part);
        } catch (IllegalArgumentException e) {
            System.out.println("Oops! We got an IllegalArgumentException: " + e.getMessage());
            System.out.println("You can't have start number bigger than end number!");
        } catch (Exception e) {
            System.out.println("Some other error happened: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Program Start ===");
        
        causeException();
        
        System.out.println("=== Now let's try handling it ===");
        
        handleException();
        
        System.out.println("=== Program End ===");
    }
}