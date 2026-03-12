import java.util.Scanner;
import java.util.Stack;

/**
 * =====================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * This program checks whether a string is a palindrome
 * using a stack strategy.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine().toLowerCase();   // convert to lowercase

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
 * Defines the contract for palindrome algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =====================================================
 * CLASS - StackStrategy
 * =====================================================
 * Stack-based implementation of palindrome checking.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

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