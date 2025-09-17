import java.util.Scanner;

class totalProducts {
    static Scanner sc = new Scanner(System.in);
   public static int totalProducts = 0;
    void displayTotalProducts(){
        System.out.println("Total Products : "+totalProducts);
    }
}
public class Product extends totalProducts {

    String productName;
    double price;

    Product(){
        System.out.println("This is Default Constructor ");
    }
    Product(String productName,double price){
        totalProducts +=1;
        this.productName = productName;
        this.price = price;

    }
    void productDetails(){
        sc.nextLine();
        System.out.println("Enter The Product Details");
        System.out.println("Product Name : ");
        productName = sc.nextLine();
        System.out.println("Enter Product Price : ");
        price = sc.nextDouble();
    }
    public static void main(String[] args) {
        totalProducts tp = new totalProducts();
        Product p = new Product();
        p.productDetails();
        Product p2 = new Product(p.productName , p.price);
        p2.productDetails();
        Product p3 = new Product(p.productName , p.price);
        tp.displayTotalProducts();
    }

}
