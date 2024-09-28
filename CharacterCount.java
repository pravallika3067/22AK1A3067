import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Use a HashMap to count occurrences of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // Convert the character to lower case to make the count case-insensitive
            c = Character.toLowerCase(c);
            // Update the count in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Display the character counts
        System.out.println("Character occurrences in the given string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
