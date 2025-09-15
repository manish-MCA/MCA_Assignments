import java.util.Scanner;

public class StringLength {
    
    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        
        try {
            // Use infinite loop to count characters
            while (true) {
                // Try to access each character
                char c = text.charAt(count);
                count = count + 1;  // Count the character
            }
        } catch (Exception e) {
            // When we get error, it means we reached the end
            return count;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        System.out.println("You entered: " + word);
        
        // Find length using our method
        int myLength = findLength(word);
        System.out.println("Our method says length: " + myLength);
        
        // Find length using Java's built-in method
        int javaLength = word.length();
        System.out.println("Java's method says length: " + javaLength);
        
        // Compare the results
        if (myLength == javaLength) {
            System.out.println("✓ Great! Our method works correctly!");
        } else {
            System.out.println("✗ Oops! Our method is wrong.");
        }
    }
}