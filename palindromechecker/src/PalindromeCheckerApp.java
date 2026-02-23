import java.util.Scanner;

public class PalindromeCheckerApp {
    /**
     * ============================================================
     * MAIN CLASS – UseCase4PalindromeCheckerApp
     * ============================================================
     *
     * Use Case 4: Character Array Based Validation
     *
     * Description:
     * This class validates a palindrome by converting
     * the string into a character array and comparing
     * characters using the two-pointer technique.
     *
     * At this stage, the application:
     * - Accepts input from the user
     * - Converts string to char array
     * - Uses start and end pointers
     * - Compares characters efficiently
     * - Displays the result
     *
     * This reduces extra memory usage.
     *
     * @author Developer
     * @version 4.0
     */


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Input : ");
            String input = sc.nextLine();

            char[] chars = input.toCharArray();

            int start = 0;
            int end = chars.length - 1;

            boolean isPalindrome = true;

            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            System.out.println("Is Palindrome? : " + isPalindrome);

            sc.close();
        }
    }