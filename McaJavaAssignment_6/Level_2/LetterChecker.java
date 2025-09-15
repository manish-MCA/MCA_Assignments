import java.util.Scanner;

public class LetterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text: ");
        String text = scanner.nextLine();
        
        System.out.println("Character analysis:");
        System.out.println("------------------");
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type;
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                type = "Vowel";
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                type = "Consonant";
            } else {
                type = "Not a Letter";
            }
            
            System.out.println("'" + c + "' -> " + type);
        }
    }
}