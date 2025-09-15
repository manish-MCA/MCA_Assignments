import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        boolean isPalindrome = true;
        
        for (int i = 0; i < word.length() / 2; i++) {
            char start = word.charAt(i);
            char end = word.charAt(word.length() - 1 - i);
            
            if (start != end) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Yes, it's a palindrome!");
        } else {
            System.out.println("No, it's not a palindrome");
        }
    }
}