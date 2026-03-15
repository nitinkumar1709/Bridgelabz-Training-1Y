import java.util.Scanner;

public class CharArrayComparison {

    
    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

   
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = sc.next();

        
        char[] userChars = getChars(input);

       
        char[] builtinChars = input.toCharArray();

        
        boolean isEqual = compareCharArrays(userChars, builtinChars);

        
        System.out.print("Characters using user-defined method: ");
        for (char c : userChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : builtinChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + isEqual);

        sc.close();
    }
}