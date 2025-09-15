import java.util.Scanner;

public class StringCharacters {
    // print characters manually
    public static void printCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("Manual characters: ");
        printCharacters(text);

        System.out.println("\nUsing toCharArray(): ");
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
