import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring manually using charAt
    public static String createSubstring(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub = sub + str.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Substring using charAt: " + manualSub);
        System.out.println("Substring using substring(): " + builtInSub);

        if (manualSub.equals(builtInSub)) {
            System.out.println("Both substrings are the same.");
        } else {
            System.out.println("Substrings are different.");
        }
    }
}
