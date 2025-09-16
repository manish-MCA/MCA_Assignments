import java.util.*;
public class MobilePhone {
    Scanner sc = new Scanner(System.in);
    String brand ;
    String model;
    double price;
    MobilePhone(){}
    MobilePhone( String brand , String model , double price){
        this.brand =brand;
        this.model = model;
        this.price = price;
    }

    void getMobileDetails(){
        System.out.println("Mobile Details");
        System.out.println("Brand Name : ");
        brand = sc.next();
        System.out.println("Model Name : ");
        model = sc.next();
        System.out.println("Price : ");
        price = sc.nextDouble();
    }

    void showDeatails(){
        System.out.println("Brand :" + brand);
        System.out.println("Model :" + model);
        System.out.println("Price :" + price);
    }
    public static void main(String[] args) {

        MobilePhone m = new MobilePhone();
        m.getMobileDetails();
        MobilePhone m2= new MobilePhone(m.brand,m.model,m.price );
        System.out.println("Details from diffrent object : ");
        m2.showDeatails();
    }
}
