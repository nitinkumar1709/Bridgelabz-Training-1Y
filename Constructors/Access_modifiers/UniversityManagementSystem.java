class Student {
    
    public int rollNumber;       
    protected String name;        
    private double CGPA;         

    
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
            System.out.println("CGPA updated successfully.");
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}


class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    
    public void displayPostgraduateDetails() {
        
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); 
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Student s1 = new Student(101, "Alice", 8.5);
        System.out.println("--- Student Details ---");
        s1.displayDetails();
        System.out.println();

        
        s1.setCGPA(9.0);
        System.out.println("Updated Student Details:");
        s1.displayDetails();
        System.out.println();

        
        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 9.2, "Computer Science");
        System.out.println("--- Postgraduate Student Details ---");
        pg.displayPostgraduateDetails();
    }
}