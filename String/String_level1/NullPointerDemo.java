import java.util.Scanner;

public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        
        System.out.println("Length of text: " + text.length());
    }

  
    public static void handleException() {
        String text = null;

        try {
           
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException (without handling):");
        try {
            generateException();  
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nDemonstrating NullPointerException (with handling inside method):");
        handleException(); 
    }
}