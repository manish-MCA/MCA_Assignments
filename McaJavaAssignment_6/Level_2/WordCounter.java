import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        System.out.println("Words and their lengths:");
        
        String currentWord = "";
        int wordCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (c == ' ') {
                if (!currentWord.equals("")) {
                    wordCount++;
                    System.out.println("Word " + wordCount + ": '" + currentWord + "' - Length: " + currentWord.length());
                    currentWord = "";
                }
            } else {
                currentWord = currentWord + c;
            }
        }
        
        if (!currentWord.equals("")) {
            wordCount++;
            System.out.println("Word " + wordCount + ": '" + currentWord + "' - Length: " + currentWord.length());
        }
        
        System.out.println("Total words: " + wordCount);
    }
}