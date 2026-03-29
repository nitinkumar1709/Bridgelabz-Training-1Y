import college.student.Student;
import college.faculty.Faculty;

public class MainClass {
    public static void main(String[] args) {

       
        Student s1 = new Student("Alice", 101);
        s1.displayStudentDetails();
        System.out.println();

        
        Faculty f1 = new Faculty("Dr. Smith", "Mathematics");
        f1.displayFacultyDetails();
    }
}