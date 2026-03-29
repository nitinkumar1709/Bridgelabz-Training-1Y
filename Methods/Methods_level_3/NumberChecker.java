import java.util.Arrays;

public class NumberChecker {

    
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int n = Math.abs(number);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        int number = 12021;

        System.out.println("Number: " + number);

        
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed array: " + Arrays.toString(reversed));

        
        boolean arraysEqual = areArraysEqual(digits, reversed);
        System.out.println("Digits array equals reversed array? " + arraysEqual);

        
        boolean palindrome = isPalindrome(number);
        System.out.println("Is Palindrome? " + palindrome);

        
        boolean duck = isDuckNumber(number);
        System.out.println("Is Duck Number? " + duck);
    }
}