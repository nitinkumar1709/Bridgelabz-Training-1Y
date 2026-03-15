import java.util.Scanner;

class PalindromeChecker {
    String text;

    
    PalindromeChecker(String text) {
        this.text = text;
    }

    
    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed); 
    }

   
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();

        sc.close();
    }
}