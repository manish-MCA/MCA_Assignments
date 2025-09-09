import java.util.*;
// Store an array of 5 integers and print them using a for-each loop.
public class Q15 {
    Scanner sc = new Scanner(System.in);

    public void printArrayWithForeach(){
        int[] arr = new int[5];

        System.out.println("Enter the 5 integer in the Array : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.println("The Values : " + i);
        }
    }

    public static void main(String[] args) {
        Q15 q = new Q15();

        q.printArrayWithForeach();
    }
}
