/*
 * LeetCode #2824 - Count Pairs Whose Sum is Less than Target
 *
 * Approach:
 * Two Pointer
 *
 * First, sort the list.
 * We use two pointers:
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * If nums[left] + nums[right] < target, then every element
 * between left and right can form a valid pair with nums[left].
 * Therefore, we can add (right - left) pairs at once.
 *
 * Otherwise, move right to find a smaller value.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) auxiliary space
 */

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(java.util.List<Integer> nums, int target) {

        java.util.Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

        while (left < right) {

            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        java.util.List<Integer> nums = new java.util.ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        int target = 2;

        System.out.println(countPairs(nums, target));
    }
}
