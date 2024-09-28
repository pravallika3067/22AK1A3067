import java.util.Scanner;

public class EvenLengthSubstrings {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Print substrings of even length
        printEvenLengthSubstrings(input);
    }

    // Method to print substrings of even length
    public static void printEvenLengthSubstrings(String str) {
        int length = str.length();

        // Iterate over all possible starting points
        for (int start = 0; start < length; start++) {
            // Iterate over all possible ending points
            for (int end = start + 2; end <= length; end += 2) {
                // Extract substring
                String substring = str.substring(start, end);
                // Print the substring
                System.out.println(substring);
            }
        }
    }
}
