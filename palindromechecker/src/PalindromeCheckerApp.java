import java.util.*;

public class PalindromeCheckerApp {
    /**
     * =========================================================
     * MAIN CLASS - UseCase13PalindromeCheckerApp
     * =========================================================
     *
     * Use Case 13: Performance Comparison
     *
     * Description:
     * This class measures and compares the execution
     * performance of palindrome validation algorithms.
     *
     * The application:
     * - Uses a palindrome strategy implementation
     * - Captures execution start and end time
     * - Calculates total execution duration
     * - Displays benchmarking results
     *
     * @author Developer
     * @version 13.0
     */


        public static void main(String[] args) {

            String input = "level";

            // Inject palindrome strategy
            PalindromeStrategy strategy = new StackStrategy();

            // Start time
            long startTime = System.nanoTime();

            // Execute algorithm
            boolean result = strategy.check(input);

            // End time
            long endTime = System.nanoTime();

            // Calculate execution time
            long executionTime = endTime - startTime;

            // Print results
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
            System.out.println("Execution Time : " + executionTime + " ns");
        }
    }

    /**
     * Interface defining palindrome strategy.
     */
    interface PalindromeStrategy {

        boolean check(String input);
    }

    /**
     * Stack-based palindrome implementation.
     */
    class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            java.util.Stack<Character> stack = new java.util.Stack<>();

            // Push characters to stack
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            // Compare with popped characters
            for (char c : input.toCharArray()) {

                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }