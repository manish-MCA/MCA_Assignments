import java.util.Scanner;

public class SimpleBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("BMI Calculator for 3 people");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Person " + i + ":");
            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Height (cm): ");
            double height = scanner.nextDouble();
            
            // Convert cm to meters
            double heightMeters = height / 100;
            double bmi = weight / (heightMeters * heightMeters);
            
            System.out.print("BMI: " + bmi + " - ");
            
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
            System.out.println();
        }
    }
}