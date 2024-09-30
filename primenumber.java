import java.util.Scanner;

public class PrimeNumberRange {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the range from the user
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers in the range from " + start + " to " + end + ":");

        // Print prime numbers in the specified range
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
