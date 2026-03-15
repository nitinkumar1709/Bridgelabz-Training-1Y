import java.util.Scanner;

public class UniqueCharFrequency {

    
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

   
    public static char[] uniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    
    public static String[][] charFrequency(String str) {
        int[] freq = new int[256]; 
        int length = getStringLength(str);

        
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            freq[(int) c]++;
        }

       
        char[] uniqueChars = uniqueCharacters(str);

        
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[(int) uniqueChars[i]]);
        }

        return result;
    }

    
    public static void displayFrequency(String[][] data) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        String[][] freqTable = charFrequency(input);

        
        displayFrequency(freqTable);

        sc.close();
    }
}