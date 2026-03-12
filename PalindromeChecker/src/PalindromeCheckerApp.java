import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean twoPointerCheck(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Method 2: Stack approach
    public static boolean stackCheck(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque approach
    public static boolean dequeCheck(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Two Pointer Performance
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack Performance
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque Performance
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");

        System.out.println("Two Pointer Approach: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Approach: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Approach: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
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