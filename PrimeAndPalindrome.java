import java.util.Scanner;

public class PrimeAndPalindrome {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find the next palindrome greater than a given number
    public static int nextPalindrome(int num) {
        int nextNum = num + 1;
        while (true) {
            if (isPalindrome(nextNum)) {
                return nextNum;
            }
            nextNum++;
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            int palindrome = nextPalindrome(number);
            System.out.println("Next palindrome after " + number + " is: " + palindrome);
        } else {
            System.out.println("Not Prime");
        }

        scanner.close();
    }
}
