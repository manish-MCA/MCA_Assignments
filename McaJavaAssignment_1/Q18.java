import java.util.*;
// Take a string input and print characters one by one, but stop when a space is found.
public class Q18 {
    public static void main(String[] args) {
        String input = "Manish Sharma";


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' ) {
                break;
            }

            System.out.println(input.charAt(i));
        }
    }
}
