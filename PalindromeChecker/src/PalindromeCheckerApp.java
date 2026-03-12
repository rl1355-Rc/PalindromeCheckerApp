import java.util.Scanner;
import java.util.Stack;

/**
 * =====================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * This program demonstrates selecting a palindrome
 * validation algorithm dynamically using the
 * Strategy Design Pattern.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * =====================================================
 * INTERFACE - PalindromeStrategy
 * =====================================================
 *
 * Defines contract for palindrome algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =====================================================
 * CLASS - StackStrategy
 * =====================================================
 *
 * Stack-based implementation of palindrome checking.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}