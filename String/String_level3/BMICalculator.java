import java.util.Scanner;

public class BMICalculator {

   
    public static String[] calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weightKg / (heightM * heightM);
        String status = "";

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    
    public static String[][] processBMIs(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4]; 
        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMI(weight, height);

            result[i][0] = String.format("%.2f", height);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    
    public static void displayTable(String[][] data) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[][] heightWeight = new double[n][2]; 

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        
        String[][] bmiResults = processBMIs(heightWeight);

       
        displayTable(bmiResults);

        sc.close();
    }
}