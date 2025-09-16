import java.util.*;
public class Book {
    Scanner sc = new Scanner(System.in);

    String title;
    String author;
    double price;

       void enterBookDetails(){
        System.out.println("ENter Book Details : ");
        System.out.println("Book title :");
        title = sc.nextLine();
        System.out.println("Book author :");
        author = sc.nextLine();
        System.out.println("Book price :");
        price = sc.nextDouble();
       }

       void displayBookDetails(){
        System.out.println("THe Book Details 👍 ");
        System.out.println("Book title :"+title);
        System.out.println("Book author :"+author);
        System.out.println("Book price :"+price);
       }

    public static void main(String[] args) {
        Book b = new Book();
        b.enterBookDetails();
        b.displayBookDetails();
    }
}
