import java.util.Scanner;

public class PalindromeCheckerApp {
/**
 * ============================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * by taking input from the user.
 *
 * The application:
 * - Accepts a string from the user
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
        /**
         * Application entry point for UC2.
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = sc.nextLine();

            boolean isPalindrome = true;

            // Loop only till half of the string length
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is it a Palindrome? : " + isPalindrome);

            sc.close();
        }
    }