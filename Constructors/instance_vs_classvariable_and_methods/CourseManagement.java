class Course {
    
    String courseName;
    int duration; 
    double fee;

    
    static String instituteName = "ABC Institute";

    
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

   
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}

public class CourseManagement {
    public static void main(String[] args) {
       
        Course c1 = new Course("Java Programming", 8, 500);
        Course c2 = new Course("Python Programming", 6, 400);

       
        System.out.println("--- Initial Course Details ---");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        
        Course.updateInstituteName("XYZ Academy");
        System.out.println();

        
        System.out.println("--- Updated Course Details ---");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}