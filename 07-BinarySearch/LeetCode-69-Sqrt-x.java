/*
 * LeetCode #69 - Sqrt(x)
 *
 * Approach:
 * Binary Search
 *
 * We search for the largest integer whose square is less than
 * or equal to x.
 *
 * low  -> starts from 1
 * high -> starts from x
 *
 * If mid * mid <= x, mid can be the answer, so move low forward.
 * Otherwise, move high backward.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class SqrtX {

    public static int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int x = 8;

        System.out.println(mySqrt(x));
    }
}
