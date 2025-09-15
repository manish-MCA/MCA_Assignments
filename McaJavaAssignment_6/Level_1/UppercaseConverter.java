import java.util.Scanner;

public class UppercaseConverter {
    
    // Method to convert text to uppercase using charAt()
    public static String convertToUppercase(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if character is lowercase letter (a-z)
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                char upperChar = (char)(currentChar - 32);
                result = result + upperChar;
            } else {
                // If not lowercase letter, keep it as it is
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
        String myUppercase = convertToUppercase(originalText);
        System.out.println("Our uppercase: " + myUppercase);
        
        // Convert using Java's built-in method
        String javaUppercase = originalText.toUpperCase();
        System.out.println("Java's uppercase: " + javaUppercase);
        
        // Compare the two results
        boolean areSame = compareStrings(myUppercase, javaUppercase);
        
        if (areSame) {
            System.out.println("✓ Great! Our method works the same as Java's method!");
        } else {
            System.out.println("✗ Oops! Our method gives different results than Java's method.");
        }
    }
}