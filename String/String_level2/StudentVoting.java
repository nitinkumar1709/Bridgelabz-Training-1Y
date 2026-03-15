import java.util.Scanner;
import java.util.Random;

public class StudentVoting {

    
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(83) + 10; 
        }
        return ages;
    }

    
    public static String[][] checkVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    
    public static void displayTable(String[][] data) {
        System.out.println("\nAge\tVoting Eligibility");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        
        int[] ages = generateAges(n);

        
        String[][] votingData = checkVotingEligibility(ages);

        
        displayTable(votingData);

        sc.close();
    }
}