public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}