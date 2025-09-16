import java.util.*;

public class Item {
    Scanner sc = new Scanner(System.in);
    String itemCode ;
    String itemName;
    double price;
    int quantity;

    void getItemDetails(){
        System.out.println("Enter Item Details : ");
        System.out.println("Enter Item Code : ");
        itemCode = sc.next();
        System.out.println("Enter Item Name : ");
        itemName = sc.next();
        System.out.println("Enter Item Price : ");
        price = sc.nextDouble();
        System.out.println("Enter Item Quantity : ");
        quantity = sc.nextInt();

    }

    void displayItemsDetails(){
        System.out.println("Items Detaisl are : ");
        System.out.println("Item Code : "+itemCode);
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Price : "+price);
        System.out.println("Item Tatal Quantity Cost : "+(quantity * price)+"rs");
    }

    public static void main(String[] args) {
        Item i = new Item();

        i.getItemDetails();
        i.displayItemsDetails();
    }
}
