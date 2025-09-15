import java.util.Scanner;

public class SpaceTrimmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text with spaces: ");
        String text = scanner.nextLine();
        
        // Find start (skip leading spaces)
        int start = 0;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        
        // Find end (skip trailing spaces)
        int end = text.length() - 1;
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }
        
        // Build trimmed string
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed = trimmed + text.charAt(i);
        }
        
        System.out.println("Original: '" + text + "'");
        System.out.println("Trimmed: '" + trimmed + "'");
    }
}