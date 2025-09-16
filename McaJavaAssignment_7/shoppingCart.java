import java.util.Scanner;
class CartItem{
    String itemName="";
    int quantity=0;
    double price=0;
    double totalPrice=0;
    void addItem(){
         quantity++;
         totalPrice+=price;
    }
    void removeItem(){
         quantity++;
         totalPrice+=price;
    }
    void showTotal(){
        System.out.println("\n\nTotal price : Rs. "+totalPrice);
    }
    void show(){
        System.out.println("\n\nItem details :\n");
        System.out.println("Item name : "+itemName);
        System.out.println("Item quantity : "+quantity);
        System.out.println("Item price : Rs. "+price);
        System.out.println("Total price : Rs. "+totalPrice);
    }
}
public class shoppingCart{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(1>0){
        CartItem item=new CartItem();
        System.out.println("\n\nEnter item details :\n");
        System.out.print("Enter item name : ");
        item.itemName=scan.next();
        System.out.print("Enter item quantity : ");
        item.quantity=scan.nextInt();
        System.out.print("Enter item price : ");
        item.price=scan.nextDouble();
        item.totalPrice=item.price*item.quantity;
        item.show();
        item.addItem();
        item.removeItem();
        item.showTotal();
            System.out.print("\n\nenter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
        }
        

    }
}