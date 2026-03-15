import java.util.Scanner;

public class VowelConsonantTable {

   
    public static String checkChar(char c) {
        
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    
    public static String[][] analyzeString(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }

        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkChar(c);
        }

        return result;
    }

    
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        String[][] analysis = analyzeString(input);

       
        displayTable(analysis);

        sc.close();
    }
}