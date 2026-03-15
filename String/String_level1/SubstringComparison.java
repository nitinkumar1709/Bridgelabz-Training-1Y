import java.util.Scanner;

public class SubstringComparison {

    
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String original = sc.next();

        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start < 0 || end > original.length() || start >= end) {
            System.out.println("Invalid indices!");
            sc.close();
            return;
        }

        
        String substrCharAt = substringUsingCharAt(original, start, end);

        
        String substrBuiltin = original.substring(start, end);

        
        boolean comparisonResult = compareUsingCharAt(substrCharAt, substrBuiltin);

   
        System.out.println("Substring using charAt(): " + substrCharAt);
        System.out.println("Substring using built-in substring(): " + substrBuiltin);
        System.out.println("Are both substrings equal? " + comparisonResult);

        sc.close();
    }
}