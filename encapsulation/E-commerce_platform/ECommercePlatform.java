import java.util.ArrayList;

public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        
        Electronics e1 = new Electronics("E1001", "Smartphone", 1200, 0.15);
        Clothing c1 = new Clothing("C2001", "T-Shirt", 50, 0.05);
        Groceries g1 = new Groceries("G3001", "Rice 5kg", 30);

        products.add(e1);
        products.add(c1);
        products.add(g1);

        
        for (Product p : products) {
            p.displayDetails();

            if (p instanceof Taxable) {
                Taxable taxProduct = (Taxable) p;
                System.out.println("Tax: $" + taxProduct.calculateTax());
                System.out.println(taxProduct.getTaxDetails());
            }

            System.out.println("----------------------------");
        }
    }
}