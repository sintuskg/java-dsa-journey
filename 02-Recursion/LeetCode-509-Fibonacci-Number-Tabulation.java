/*
 * LeetCode #509 - Fibonacci Number
 *
 * Approach:
 * Dynamic Programming - Tabulation (Bottom-Up)
 *
 * Instead of using recursion, we build the Fibonacci values
 * from the smallest subproblems to the required value.
 *
 * dp[i] stores the Fibonacci number for i.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Worst Case:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class FibonacciNumberTabulation {

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fib(n));
    }
}
