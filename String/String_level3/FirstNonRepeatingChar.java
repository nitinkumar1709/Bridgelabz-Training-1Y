import java.util.Scanner;

public class FirstNonRepeatingChar {

    
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

    
    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; 
        int length = getStringLength(str);

        
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            freq[(int) c]++;
        }

        
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (freq[(int) c] == 1) {
                return c;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char firstNonRepeat = findFirstNonRepeatingChar(input);

        if (firstNonRepeat != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeat);
        } else {
            System.out.println("All characters are repeating.");
        }

        sc.close();
    }
}