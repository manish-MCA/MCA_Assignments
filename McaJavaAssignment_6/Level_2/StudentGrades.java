import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for 1 student:");
        System.out.print("Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Math: ");
        int math = scanner.nextInt();
        
        int total = physics + chemistry + math;
        double average = total / 3.0;
        
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}