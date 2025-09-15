
import java.util.Scanner;

public class LowercaseConverter {
    
    // Method to convert text to lowercase using charAt()
    public static String convertToLowercase(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if character is uppercase letter (A-Z)
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase by adding 32 to ASCII value
                char lowerChar = (char)(currentChar + 32);
                result = result + lowerChar;
            } else {
                // If not uppercase letter, keep it as it is
                result = result + currentChar;
            }
        }
        
        return result;
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // First check if they have same length
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text: ");
        String originalText = scanner.nextLine();
        
        System.out.println("Original text: " + originalText);
        
        // Convert using our own method
        String myLowercase = convertToLowercase(originalText);
        System.out.println("Our lowercase: " + myLowercase);
        
        // Convert using Java's built-in method
        String javaLowercase = originalText.toLowerCase();
        System.out.println("Java's lowercase: " + javaLowercase);
        
        // Compare the two results
        boolean areSame = compareStrings(myLowercase, javaLowercase);
        
        if (areSame) {
            System.out.println("✓ Great! Our method works the same as Java's method!");
        } else {
            System.out.println("✗ Oops! Our method gives different results than Java's method.");
        }
    }
}