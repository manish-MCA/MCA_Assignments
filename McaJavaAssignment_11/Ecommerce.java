import java.util.*;


interface Taxable{
    void calculateTax();
    void getTaxDetails();  
}

// price + tax - discount
// Tax Rate=18%
// Discount Amount= Original Price ×  Discount Rate​ / 100
abstract class Product implements Taxable{
    int id ;
    String name;
    double price;
    double discountAmount;
    double taxRate = 0.18;
    double taxAmount;
    abstract void calculateDiscount();
    void getter(int id,String name , double price){}
    void setter(){}
} 

class Electronics extends Product {
    
    public void getter(int id,String name , double price){
        System.out.println("Enter the Details for Electronics : ");
        this.id = id;
        this.name= name;
        this.price = price;
    }
    public void setter(){
        System.out.println("The Details Your ve enterd :");
        System.out.println("Product id : "+id+"Product name :"+name+"Product Price : "+price);
    }

    public void calculateTax(){
        taxAmount = price * taxRate;
        System.out.println("The Calculated Tax Amount : "+taxAmount);

    }

    public void getTaxDetails(){
        double finalAmount = taxAmount + price;

        System.out.println("The Amount before TAX : "+price);
        System.out.println("The Amount After TAX : "+finalAmount);
    }
    public void calculateDiscount(){
        discountAmount = (price * taxRate);
        System.out.println("Price before the DIscount : "+price);
        System.out.println("Price after the DIscount : "+(price - discountAmount));

    }
}

class Clothing extends Product{

    public void getter(int id,String name , double price){
        System.out.println("Enter the Details for Electronics : ");
        this.id = id;
        this.name= name;
        this.price = price;
    }
    public void setter(){
        System.out.println("The Details Your ve enterd :");
        System.out.println("Product id : "+id+"Product name :"+name+"Product Price : "+price);
    }

    public void calculateTax(){
        taxAmount = price * taxRate;
        System.out.println("The Calculated Tax Amount : "+taxAmount);

    }

    public void getTaxDetails(){
        double finalAmount = taxAmount + price;

        System.out.println("The Amount before TAX : "+price);
        System.out.println("The Amount After TAX : "+finalAmount);
    }
    public void calculateDiscount(){
        discountAmount = (price * taxRate);
        System.out.println("Price before the DIscount : "+price);
        System.out.println("Price after the DIscount : "+(price - discountAmount));

    }
    
}

class Groceries extends Product{
    public void getter(int id,String name , double price){
        System.out.println("Enter the Details for Electronics : ");
        this.id = id;
        this.name= name;
        this.price = price;
    }
    public void setter(){
        System.out.println("The Details Your ve enterd :");
        System.out.println("Product id : "+id+"Product name :"+name+"Product Price : "+price);
    }

    public void calculateTax(){
        taxAmount = price * taxRate;
        System.out.println("The Calculated Tax Amount : "+taxAmount);

    }

    public void getTaxDetails(){
        double finalAmount = taxAmount + price;

        System.out.println("The Amount before TAX : "+price);
        System.out.println("The Amount After TAX : "+finalAmount);
    }
    public void calculateDiscount(){
        discountAmount = (price * taxRate);
        System.out.println("Price before the DIscount : "+price);
        System.out.println("Price after the DIscount : "+(price - discountAmount));

    }
    
}
public class Ecommerce {
    
}
