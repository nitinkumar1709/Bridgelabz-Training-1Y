import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost
    void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

public class ItemProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Price: ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.println("\nItem Details:");
        item.displayDetails();

        System.out.println("\nTotal Cost Calculation:");
        item.calculateTotalCost(quantity);

        sc.close();
    }
}