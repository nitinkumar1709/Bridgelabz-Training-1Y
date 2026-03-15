import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart;

    ShoppingCart() {
        cart = new ArrayList<>();
    }

   
    void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        System.out.println(quantity + " " + itemName + "(s) added to the cart.");
    }

    
    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                removed = true;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    
    void displayTotal() {
        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " | Price: $" + item.price + " | Quantity: " + item.quantity + " | Total: $" + item.getTotal());
            total += item.getTotal();
        }
        System.out.println("Total Cart Cost: $" + total);
    }
}

public class ShoppingCartTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    cart.displayTotal();
                    break;
                case 4:
                    System.out.println("Exiting Shopping Cart.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}