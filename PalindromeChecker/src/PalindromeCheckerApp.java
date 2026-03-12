import java.util.Scanner;

/**
 * =====================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * This class demonstrates palindrome validation using
 * object-oriented design. The palindrome logic is
 * encapsulated inside a PalindromeService class.
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

/**
 * =====================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * Example:
 * "A man a plan a canal Panama"
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * Application entry point for UC10.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * =====================================================
 * CLASS - PalindromeService
 * =====================================================
 *
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
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
        // Normalize string (remove spaces/symbols and convert to lowercase)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
 * MAIN CLASS - UseCase9PalindromeChecker
 * =====================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
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
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: if pointers cross
        if (start >= end) {
            return true;
        }

        // If characters mismatch
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return true;
        // Recursive call
        return check(s, start + 1, end - 1);
    }
}