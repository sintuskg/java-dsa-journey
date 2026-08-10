/*
 * LeetCode #167 - Two Sum II - Input Array Is Sorted
 *
 * Approach:
 * Two Pointer
 *
 * We use two pointers:
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * Since the array is sorted:
 * - If the sum is greater than target, move right backward.
 * - If the sum is less than target, move left forward.
 * - If the sum equals target, return the 1-based indices.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class TwoSumIIInputArrayIsSorted {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[] {
                        left + 1,
                        right + 1
                };
            }
        }

        return new int[] {
                -1, -1
        };
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
