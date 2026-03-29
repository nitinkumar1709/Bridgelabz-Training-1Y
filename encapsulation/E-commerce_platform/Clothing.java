public class Clothing extends Product implements Taxable {
    private double taxRate; 

    public Clothing(String productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
       
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (taxRate * 100) + "%";
    }
}