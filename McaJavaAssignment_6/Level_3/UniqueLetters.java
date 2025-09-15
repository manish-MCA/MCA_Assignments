import java.util.Scanner;

public class UniqueLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("Unique letters:");
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            boolean isUnique = true;
            
            // Check if this letter appears before
            for (int j = 0; j < i; j++) {
                if (word.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                System.out.print(current + " ");
            }
        }
    }
}