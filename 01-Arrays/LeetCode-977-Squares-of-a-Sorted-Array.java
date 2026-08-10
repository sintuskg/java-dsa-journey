/*
 * LeetCode #977 - Squares of a Sorted Array
 *
 * Approach:
 * Two Pointer
 *
 * We use two pointers:
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * The largest square can come from either end because
 * the input array is sorted. We compare absolute values
 * and place the larger square from the end of the result array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[k] = nums[left] * nums[left];
                left++;
            } else {
                res[k] = nums[right] * nums[right];
                right--;
            }

            k--;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
