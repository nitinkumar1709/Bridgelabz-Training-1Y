import java.util.Scanner;

public class CharFrequency {

    
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

    
    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256]; 
        int length = getStringLength(str);

        
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            freq[(int) c]++;
        }

        
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            boolean isFirstOccurrence = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isFirstOccurrence = false;
                    break;
                }
            }
            if (isFirstOccurrence) uniqueCount++;
        }

        
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            boolean isFirstOccurrence = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isFirstOccurrence = false;
                    break;
                }
            }
            if (isFirstOccurrence) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[(int) c]);
                index++;
            }
        }

        return result;
    }

    
    public static void displayFrequencyTable(String[][] data) {
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

        
        String[][] freqTable = findCharFrequency(input);


        displayFrequencyTable(freqTable);

        sc.close();
    }
}