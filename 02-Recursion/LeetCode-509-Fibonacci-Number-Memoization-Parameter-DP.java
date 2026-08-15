/*
 * LeetCode #509 - Fibonacci Number
 *
 * Approach:
 * Recursion + Memoization (Top-Down Dynamic Programming)
 *
 * The dp array is passed as a parameter instead of using a static
 * class-level variable. Each Fibonacci value is calculated once
 * and stored in dp for future recursive calls.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Worst Case:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class FibonacciNumberMemoizationParameterDP {

    public static int fibo(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = fibo(n - 1, dp) + fibo(n - 2, dp);
        dp[n] = ans;

        return ans;
    }

    public static int fib(int n) {

        int[] dp = new int[n + 1];
        return fibo(n, dp);
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fib(n));
    }
}
