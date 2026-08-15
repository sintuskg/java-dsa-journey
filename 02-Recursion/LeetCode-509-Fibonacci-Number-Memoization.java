/*
 * LeetCode #509 - Fibonacci Number
 *
 * Approach:
 * Recursion + Memoization (Top-Down Dynamic Programming)
 *
 * We store already calculated Fibonacci values in the dp array.
 * If a value has already been calculated, we return it directly
 * instead of making the same recursive calls again.
 *
 * This removes the repeated calculations of the basic recursive
 * approach and reduces the time complexity significantly.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Worst Case:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class FibonacciNumberMemoization {

    static int[] dp;

    public static int fibo(int n) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = fibo(n - 1) + fibo(n - 2);
        dp[n] = ans;

        return ans;
    }

    public static int fib(int n) {

        dp = new int[n + 1];
        return fibo(n);
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(fib(n));
    }
}
