import java.util.Scanner;

public class FirstUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            boolean foundDuplicate = false;
            
            // Check if this letter appears elsewhere
            for (int j = 0; j < word.length(); j++) {
                if (i != j && word.charAt(j) == current) {
                    foundDuplicate = true;
                    break;
                }
            }
            
            if (!foundDuplicate) {
                System.out.println("First unique letter: " + current);
                return;
            }
        }
        
        System.out.println("No unique letters found");
    }
}