import java.util.Scanner;

public class StringLengthDemo {

   
    public static int getStringLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.next();

        
        int lengthUserDefined = getStringLength(input);

        
        int lengthBuiltin = input.length();

       
        System.out.println("Length of string (user-defined method): " + lengthUserDefined);
        System.out.println("Length of string (built-in length() method): " + lengthBuiltin);

        sc.close();
    }
}