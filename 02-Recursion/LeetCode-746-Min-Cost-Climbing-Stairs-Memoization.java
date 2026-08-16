/*
 * LeetCode #746 - Min Cost Climbing Stairs
 *
 * Approach:
 * Recursion + Memoization (Top-Down Dynamic Programming)
 *
 * We calculate the minimum cost required to reach each stair.
 * For every index, we can arrive from the previous stair or
 * from two stairs before it, so we choose the minimum of both.
 *
 * The dp array stores already calculated results to avoid
 * repeated recursive calculations.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Worst Case:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

public class MinCostClimbingStairsMemoization {

    public static int minCost(int[] cost, int idx, int[] dp) {

        if (idx == 0 || idx == 1) {
            return cost[idx];
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        return dp[idx] = cost[idx] + Math.min(
                minCost(cost, idx - 1, dp),
                minCost(cost, idx - 2, dp)
        );
    }

    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(
                minCost(cost, n - 1, dp),
                minCost(cost, n - 2, dp)
        );
    }

    public static void main(String[] args) {

        int[] cost = {10, 15, 20};

        System.out.println(minCostClimbingStairs(cost));
    }
}
