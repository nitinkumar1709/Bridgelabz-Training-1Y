import java.util.Scanner;

class Circle {
    double radius;

    
    double area() {
        return 3.14 * radius * radius;
    }

   
    double circumference() {
        return 2 * 3.14 * radius;
    }

    
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area());
        System.out.println("Circumference of Circle: " + circumference());
    }
}

public class CircleProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius of the circle: ");
        c.radius = sc.nextDouble();

        c.display();

        sc.close();
    }
}