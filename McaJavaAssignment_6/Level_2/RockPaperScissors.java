import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        
        System.out.print("Your choice (1-3): ");
        int userChoice = scanner.nextInt();
        
        int computerChoice = (int)(Math.random() * 3) + 1;
        
        System.out.println("Computer chose: " + computerChoice);
        
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win! 🎉");
        } else {
            System.out.println("Computer wins! 🤖");
        }
    }
}