import java.util.*;

import javax.swing.border.LineBorder;
public class Library {
   static Scanner sc = new Scanner(System.in);
    String title;
    String author;
    double price;
    boolean availability;

    void getBookDetails(){
        System.out.println("Enter the Book you want to Borrow : ");
        System.out.println("Enter Book Title : " );
        title = sc.nextLine();
        System.out.println("Enter the Author Name : ");
        author = sc.nextLine();
        System.out.println("Enter the Price of the Book");
        price = sc.nextDouble();

        isBookBorrowed();
    }

    boolean isBookBorrowed(){
        availability = !availability;
        if (!availability ) {
            System.out.println("THe Book is Not Available ");
            return false;
        }else{
            System.out.println("The Book is Available ");
        }
        return true;
    }
    void display(){
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println(" ");

        if (availability) {
            System.out.println("Yes the Book Available for you ");
        }
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println("Details");
        System.out.println("Book : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        Library lb = new Library();
            lb.getBookDetails();
            lb.display();
        
    }

}
