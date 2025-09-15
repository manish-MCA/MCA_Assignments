import java.util.Scanner;

public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String currentWord = "";
        String longestWord = "";
        String shortestWord = text; // Start with the whole text
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (c == ' ') {
                if (!currentWord.equals("")) {
                    if (currentWord.length() > longestWord.length()) {
                        longestWord = currentWord;
                    }
                    if (currentWord.length() < shortestWord.length()) {
                        shortestWord = currentWord;
                    }
                    currentWord = "";
                }
            } else {
                currentWord = currentWord + c;
            }
        }
        
        if (!currentWord.equals("")) {
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;
            }
        }
        
        System.out.println("Longest word: '" + longestWord + "' (" + longestWord.length() + " letters)");
        System.out.println("Shortest word: '" + shortestWord + "' (" + shortestWord.length() + " letters)");
    }
}