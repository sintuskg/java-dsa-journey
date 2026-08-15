/*
 * LeetCode #509 - Fibonacci Number
 *
 * Approach:
 * Recursion
 *
 * The Fibonacci sequence follows the rule:
 * F(n) = F(n - 1) + F(n - 2)
 *
 * Base cases:
 * F(0) = 0
 * F(1) = 1
 *
 * For every n greater than 1, we recursively calculate the
 * previous two Fibonacci numbers and add them together.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 */

public class FibonacciNumber {

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fib(n));
    }
}
