import java.util.Scanner;

public class ShortestLongestWords {

    
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

   
    public static String[] splitWords(String text) {
        int length = getStringLength(text);
        int wordCount = 0;

        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        wordCount++; 

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceIndexes[index++] = i;
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndexes[i] : length;
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    
    public static String[][] wordsWithLength(String[] words) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordData;
    }

    
    public static int[] findShortestLongest(String[][] wordData) {
        int minLength = Integer.parseInt(wordData[0][1]);
        int maxLength = Integer.parseInt(wordData[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        
        String[] words = splitWords(text);

        
        String[][] wordData = wordsWithLength(words);

        
        int[] result = findShortestLongest(wordData);

        System.out.println("\nWord and their lengths:");
        for (String[] wd : wordData) {
            System.out.println(wd[0] + " - " + wd[1]);
        }

        System.out.println("\nShortest word: " + wordData[result[0]][0]);
        System.out.println("Longest word: " + wordData[result[1]][0]);

        sc.close();
    }
}