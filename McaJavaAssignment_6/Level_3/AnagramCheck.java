import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();
        
        if (word1.length() != word2.length()) {
            System.out.println("Not anagrams - different lengths");
            return;
        }
        
        // Count letters in first word
        int[] count1 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            char c = Character.toLowerCase(word1.charAt(i));
            if (c >= 'a' && c <= 'z') {
                count1[c - 'a']++;
            }
        }
        
        // Count letters in second word
        int[] count2 = new int[26];
        for (int i = 0; i < word2.length(); i++) {
            char c = Character.toLowerCase(word2.charAt(i));
            if (c >= 'a' && c <= 'z') {
                count2[c - 'a']++;
            }
        }
        
        // Compare counts
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                System.out.println("Not anagrams");
                return;
            }
        }
        
        System.out.println("Yes, they are anagrams!");
    }
}