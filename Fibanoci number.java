import java.util.Scanner;

public class FibonacciChecker {

    // Method to check if a number is a Fibonacci number and to find its position
    public static int checkFibonacci(int number) {
        if (number < 0) {
            return -1; // Indicating the number is not a valid Fibonacci number
        }

        int a = 0, b = 1, position = 1;

        if (number == a) {
            return 1; // 0 is at position 1
        }
        if (number == b) {
            return 2; // 1 is at position 2
        }

        // Generate Fibonacci numbers until we exceed the input number
        while (b < number) {
            int next = a + b;
            a = b;
            b = next;
            position++;
        }

        return (b == number) ? position : -1; // Return position if it's a Fibonacci number, else -1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is a Fibonacci number and get its position
        int position = checkFibonacci(number);

        if (position != -1) {
            System.out.println(number + " is a Fibonacci number at position " + position + ".");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }

        // Close the scanner
        scanner.close();
    }
}
