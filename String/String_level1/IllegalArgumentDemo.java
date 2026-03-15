import java.util.Scanner;

public class IllegalArgumentDemo {

   
    public static void generateException(String text) {
        
        System.out.println("Substring (start > end): " + text.substring(5, 2));
    }

    
    public static void handleException(String text) {
        try {
            
            System.out.println("Substring (start > end): " + text.substring(5, 2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught IllegalArgumentException (StringIndexOutOfBoundsException): " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nDemonstrating IllegalArgumentException (without handling):");
        try {
            generateException(input); 
        } catch (RuntimeException e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nDemonstrating IllegalArgumentException (with handling inside method):");
        handleException(input); 

        sc.close();
    }
}