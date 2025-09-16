import java.util.*;
public class PallindromeCheker {
    Scanner sc = new Scanner(System.in);
    String text ;

    void getInput(){
        System.out.println("Enter the String : ");
        text = sc.next().toLowerCase();
    }
    void checkPallindrome(){
       String reverseString ="" ;
       for (int i = text.length()-1; i >= 0; i--) {
        reverseString += text.charAt(i);
       }
       if (reverseString.equals(text)) {
        System.out.println("Yes its a Pallindrome : "+text);
       }else{
         System.out.println("Nope This String is not a Pallindrome : "+text);
       }

       return ;
    }
    public static void main(String[] args) {
        PallindromeCheker pl = new PallindromeCheker();
        pl.getInput();
        pl.checkPallindrome();
    }
}
