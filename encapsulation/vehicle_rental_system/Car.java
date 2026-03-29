public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}