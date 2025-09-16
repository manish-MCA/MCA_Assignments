import java.util.Scanner;

public class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;

    void bookTicket() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== BOOK YOUR TICKET ===");
        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();
        
        System.out.print("Enter Seat Number: ");
        seatNumber = sc.nextInt();
        
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        
        System.out.println("Ticket booked successfully! ✅");
    }
    
    
    void displayTicketDetails() {
        System.out.println("\n=== TICKET DETAILS ===");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
        System.out.println("=======================");
    }
    
    public static void main(String[] args) {
        
        MovieTicket ticket1 = new MovieTicket();
        
        ticket1.bookTicket();
        
        ticket1.displayTicketDetails();
        
        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket();
        ticket2.displayTicketDetails();
    }
}