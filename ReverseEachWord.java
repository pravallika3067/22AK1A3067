public class ReverseEachWord {
    public static void main(String[] args) {
        // Sample input string
        String input = "Hello World from ChatGPT";
        
        // Reverse each word in the string
        String result = reverseEachWord(input);
        
        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result);
    }

    public static String reverseEachWord(String input) {
        // Split the input string by spaces to get individual words
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Reverse the current word
            String reversedWord = new StringBuilder(word).reverse().toString();
            // Append the reversed word to the result
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the result
        return reversedSentence.toString().trim();
    }
}
