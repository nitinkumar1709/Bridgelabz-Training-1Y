class Vehicle {
    
    String ownerName;
    String vehicleType;

    
    static double registrationFee = 500.0; 

    
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }
}

public class VehicleRegistrationTest {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");

        
        System.out.println("--- Vehicle Details ---");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        
        Vehicle.updateRegistrationFee(750.0);
        System.out.println();

       
        System.out.println("--- Updated Vehicle Details ---");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}