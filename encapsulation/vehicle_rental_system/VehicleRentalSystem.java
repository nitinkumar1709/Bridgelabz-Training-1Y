import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
       
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CP12345"));
        vehicles.add(new Bike("BIKE201", 500, "BP67890"));
        vehicles.add(new Truck("TRUCK301", 3000, "TP24680"));

        int rentalDays = 5;

        
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
                System.out.println("Insurance Details: " + ins.getInsuranceDetails());
            }

            System.out.println("---------------------------");
        }
    }
}