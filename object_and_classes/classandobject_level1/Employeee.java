import java.util.Scanner;

class Employeee {
    String name;
    int id;
    double salary;

   
    void setDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

   
    void displayDetails() {
        System.out.println("Employeee Name: " + name);
        System.out.println("Employeee ID: " + id);
        System.out.println("Employeee Salary: " + salary);
    }
}

public class  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employeee emp = new Employeee();

        
        System.out.print("Enter Employeee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employeee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employeee Salary: ");
        double salary = sc.nextDouble();

        
        emp.setDetails(name, id, salary);

        
        System.out.println("\nEmployeee Details:");
        emp.displayDetails();

        sc.close();
    }
}