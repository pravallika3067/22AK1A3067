import java.util.Scanner;

public class RelationalOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two 10-digit integers
        System.out.print("Enter the first 10-digit integer: ");
        long num1 = scanner.nextLong();
        
        System.out.print("Enter the second 10-digit integer: ");
        long num2 = scanner.nextLong();
        
        // Ensure the integers are 10 digits
        if (String.valueOf(num1).length() != 10 || String.valueOf(num2).length() != 10) {
            System.out.println("Both numbers must be 10 digits long.");
            return;
        }

        // Relational operations
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        
        scanner.close();
    }
}
