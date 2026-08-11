/*
 * LeetCode #15 - 3Sum
 *
 * Approach:
 * Sorting + Two Pointer
 *
 * First, sort the array.
 * For every fixed element nums[first], use two pointers:
 * left  -> starts from first + 1
 * right -> starts from the end
 *
 * We move the pointers based on the current sum.
 * If the sum is 0, we found a valid triplet.
 * Duplicate values are skipped to avoid duplicate triplets.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) auxiliary space
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void twoSumHelper(int first, int[] nums, List<List<Integer>> res) {

        int left = first + 1;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[first] + nums[left] + nums[right];

            if (sum > 0) {
                right--;

            } else if (sum < 0) {
                left++;

            } else {
                res.add(Arrays.asList(nums[first], nums[left], nums[right]));

                left++;
                right--;

                // Skip duplicate values.
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }

                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int first = 0; first < nums.length - 2; first++) {

            if (nums[first] > 0) {
                break;
            }

            if (first == 0 || nums[first] != nums[first - 1]) {
                twoSumHelper(first, nums, res);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));
    }
}
