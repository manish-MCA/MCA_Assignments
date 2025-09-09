import java.util.*;
// Take a character input and check whether it is a vowel or consonant using switch

public class Q9 {
    Scanner sc = new Scanner(System.in);
    
    public void vowelOrconstant(){
        System.out.println("Enter Your Character : ");

        String ch = sc.next();

        switch (ch) {
            case "a":
                System.out.println(ch + " is an Vowel");
                break;
            case "e":
                System.out.println(ch + " is an Vowel");
                break;
            case "i":
                System.out.println(ch + " is an Vowel");
                break;
            case "o":
                System.out.println(ch + " is an Vowel");
                break;
            case "u":
                System.out.println(ch + " is an Vowel");
                break;
            case "A":
                System.out.println(ch + " is an Vowel");
                break;
            case "E":
                System.out.println(ch + " is an Vowel");
                break;
            case "I":
                System.out.println(ch + " is an Vowel");
                break;
            case "O":
                System.out.println(ch + " is an Vowel");
                break;
            case "U":
                System.out.println(ch + " is an Vowel");
                break;
        
            default:
                 System.out.println(ch + " is an Constant");
                break;
        }
    }

    public static void main(String[] args) {
        Q9 q = new Q9();

        q.vowelOrconstant();
    }
}
