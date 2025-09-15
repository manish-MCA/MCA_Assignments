import java.util.Scanner;

public class WordSplitter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.println("Original text: " + sentence);
        
        // Split using our simple method
        System.out.println("Our method words:");
        splitAndPrintWords(sentence);
        
        // Split using Java's built-in method
        System.out.println("Java's method words:");
        String[] javaWords = sentence.split(" ");
        for (String word : javaWords) {
            System.out.println("'" + word + "'");
        }
    }
    
    // Simple method to split and print words without using arrays
    public static void splitAndPrintWords(String text) {
        String currentWord = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (c == ' ') {
                // When we find space, print the current word
                System.out.println("'" + currentWord + "'");
                currentWord = ""; // Reset for next word
            } else {
                // Add character to current word
                currentWord = currentWord + c;
            }
        }
        
        // Print the last word
        if (!currentWord.equals("")) {
            System.out.println("'" + currentWord + "'");
        }
    }
}