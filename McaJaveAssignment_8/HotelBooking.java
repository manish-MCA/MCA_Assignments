import java.util.*;
public class HotelBooking {
    Scanner sc = new Scanner(System.in);
    String guestName;
    String roomType;
    int nights=10;


    HotelBooking(){};

    HotelBooking(String guestName,String roomType,int nights){
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
    }

    public HotelBooking(HotelBooking Original){
        this.guestName = Original.guestName;
        this.roomType = Original.roomType;
        this.nights =  Original.nights;
    }

    public void getDetails(){
        System.out.println("Enter the Hotel for Booking : ");
        System.out.println("Enter the GuestName : ");
        guestName = sc.next();
        System.out.println("Enter the Room Type : ");
        
        roomType = sc.next();
        System.out.println("Enter the Number of Nights : ");
        nights = sc.nextInt();
        return;
    }

    void showDetails(){
        System.out.println("The Details of Booking : ");
         System.out.println(" GuestName : "+guestName);
        System.out.println(" Room Type : "+roomType);
        System.out.println("Number of Nights : "+nights);
    }


    public static void main(String[] args) {
        System.out.println("From Deafault  ");
        HotelBooking hb = new HotelBooking();
        hb.getDetails();
        hb.showDetails();

        System.out.println("===========================");
        System.out.println(" ");

        System.out.println("From Perameterize  ");
        HotelBooking hbp = new HotelBooking(hb.guestName,hb.roomType, hb.nights);
        hbp.getDetails();
        hbp.showDetails();
        System.out.println("===========================");
        System.out.println(" ");

        System.out.println("From Copy Constructor  ");
        HotelBooking Copy = new HotelBooking(hb);
        Copy.getDetails();
        Copy.showDetails();
    }
}
