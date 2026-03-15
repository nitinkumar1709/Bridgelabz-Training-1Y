import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    
    void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: " + price);
    }
}

public class MobilePhoneProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();

        System.out.print("Enter Mobile Brand: ");
        phone.brand = sc.nextLine();

        System.out.print("Enter Mobile Model: ");
        phone.model = sc.nextLine();

        System.out.print("Enter Mobile Price: ");
        phone.price = sc.nextDouble();

        System.out.println("\nMobile Phone Details:");
        phone.displayDetails();

        sc.close();
    }
}