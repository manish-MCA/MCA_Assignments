import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many players? ");
        int players = scanner.nextInt();
        
        System.out.println("Dealing 5 cards to each player:");
        
        for (int p = 1; p <= players; p++) {
            System.out.println("Player " + p + " cards:");
            for (int i = 0; i < 5; i++) {
                int suitIndex = (int)(Math.random() * suits.length);
                int rankIndex = (int)(Math.random() * ranks.length);
                System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);
            }
            System.out.println();
        }
    }
}