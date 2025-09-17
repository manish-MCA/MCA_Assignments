import java.util.*;
public class Book {

    String title;
    String author;
    double price;
    Book(){
        System.out.println("This is Default Constructor");
        System.out.println("=============================");
    }

    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("This is my Perameterize constructor ");

        System.out.println("THE BOOK DETAILS :");
        System.out.println("Title : "+ title);
        System.out.println("Author : "+ author);
        System.out.println("Price : "+price);

    }


    public static void main(String[] args) {
        Book bk = new Book();

        Book bkp = new Book("Harry Potter","J.K.Rowling",1071);
        
    }
    
}

