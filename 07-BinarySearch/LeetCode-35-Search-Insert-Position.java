/*
 * LeetCode #35 - Search Insert Position
 *
 * Approach:
 * Binary Search
 *
 * We use binary search because the array is sorted.
 *
 * If the target is found, return its index.
 * If the target is not found, left will point to
 * the correct position where the target should be inserted.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }
}
