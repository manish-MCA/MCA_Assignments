import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter ages of 3 students:");
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Student " + i + " age: ");
            int age = scanner.nextInt();
            
            if (age >= 18) {
                System.out.println("Student " + i + " can vote! ✓");
            } else {
                System.out.println("Student " + i + " cannot vote. ✗");
            }
        }
    }
}