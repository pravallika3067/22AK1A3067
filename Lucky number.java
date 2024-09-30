import java.util.Scanner;

public class LuckyNumberCalculator {

    // Method to calculate the lucky number
    public static int calculateLuckyNumber(String dob) {
        // Remove colons from the input
        dob = dob.replace(":", "");

        int sum = 0;

        // Sum the digits of the date of birth
        for (char digit : dob.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        // Reduce the sum to a single-digit number
        while (sum > 9) {
            sum = sumOfDigits(sum);
        }

        return sum;
    }

    // Helper method to sum the digits of a number
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read date of birth from the user
        System.out.print("Enter your date of birth in the format DD:MM:YY: ");
        String dob = scanner.nextLine();

        // Calculate and print the lucky number
        int luckyNumber = calculateLuckyNumber(dob);
        System.out.println("Your lucky number is: " + luckyNumber);

        // Close the scanner
        scanner.close();
    }
}
