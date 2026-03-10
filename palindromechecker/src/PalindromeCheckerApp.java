import java.util.*;

public class PalindromeCheckerApp {
    /**
     * =========================================================
     * MAIN CLASS - UseCase12PalindromeCheckerApp
     * =========================================================
     *
     * Use Case 12: Strategy Pattern for Palindrome Algorithms
     *
     * Description:
     * This class demonstrates different palindrome validation
     * algorithms that can be selected dynamically using the
     * Strategy Design Pattern.
     *
     * @author Developer
     * @version 12.0
     */


        public static void main(String[] args) {

            String input = "level";

            // Inject stack strategy
            PalindromeStrategy strategy = new StackStrategy();

            boolean result = strategy.check(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
        }
    }

    /**
     * =========================================================
     * INTERFACE - PalindromeStrategy
     * =========================================================
     *
     * Defines contract for palindrome algorithms.
     */

    interface PalindromeStrategy {

        boolean check(String input);
    }

    /**
     * =========================================================
     * CLASS - StackStrategy
     * =========================================================
     *
     * Stack-based implementation of palindrome checking.
     */

    class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            // Create stack
            java.util.Stack<Character> stack = new java.util.Stack<>();

            // Push characters into stack
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            // Compare characters by popping
            for (char c : input.toCharArray()) {

                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }