import java.util.*;
public class CarRental {
    Scanner sc = new Scanner(System.in);
    String customerName;
    String carModel;
    int rentalDays;
    double cost ;

    void getCarDetails(){
        System.out.println("Enter The Car Details You want to Rent : ");
        System.out.println("Enter Custome Name : ");
        customerName = sc.nextLine();
        System.out.println("Enter Model Name : ");
        carModel = sc.nextLine();
        System.out.println("Enter Days for Rent a Car : ");
        rentalDays = sc.nextInt();
        System.out.println("Rental Cost for 1 day ");
        cost =  sc.nextDouble();

        Totalcost();

    }

    double Totalcost(){
        return cost =  (rentalDays * cost);
    }

    void display(){
        System.out.println("Details : ");
        System.out.println("Customer Name : "+customerName);
        System.out.println("Model Name : "+carModel);
        System.out.println("Rental Days : "+rentalDays);
        System.out.println("Total Cost : "+cost);
    }
    public static void main(String[] args) {
        CarRental c =  new CarRental();
        c.getCarDetails();
        c.display();
    }
}
