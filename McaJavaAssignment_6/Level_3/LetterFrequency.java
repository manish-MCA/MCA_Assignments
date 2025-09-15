import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("Letter frequencies:");
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int count = 0;
            
            // Count how many times this letter appears
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == current) {
                    count++;
                }
            }
            
            // Check if we already printed this letter
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (word.charAt(k) == current) {
                    alreadyPrinted = true;
                    break;
                }
            }
            
            if (!alreadyPrinted) {
                System.out.println(current + ": " + count + " times");
            }
        }
    }
}