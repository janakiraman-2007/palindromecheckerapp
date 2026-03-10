import java.util.*;

public class PalindromeCheckerApp {
    /**
     * =========================================================
     * MAIN CLASS - UseCase10PalindromeCheckerApp
     * =========================================================
     *
     * Use Case 10: Normalized Palindrome Validation
     *
     * Description:
     * This program checks whether a given string is a palindrome
     * after preprocessing the input string.
     *
     * Normalization includes:
     *  - Removing spaces and special symbols
     *  - Converting all characters to lowercase
     *
     * Example:
     * "A man a plan a canal Panama"
     *
     * @author Developer
     * @version 1.0
     */



        public static void main(String[] args) {

            // Input string
            String input = "A man a plan a canal Panama";

            // Normalize the string:
            // remove spaces and special characters and convert to lowercase
            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Variable to track palindrome status
            boolean isPalindrome = true;

            // Compare characters from both ends of the string
            for (int i = 0; i < normalized.length() / 2; i++) {

                // Compare symmetric characters
                if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {

                    // If characters do not match, it is not a palindrome
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }