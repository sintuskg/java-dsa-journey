/*
 * LeetCode #75 - Sort Colors
 *
 * Approach:
 * Dutch National Flag Algorithm
 *
 * We use three pointers:
 * i -> position where the next 0 should be placed
 * k -> current element being processed
 * j -> position where the next 2 should be placed
 *
 * If nums[k] is 0, swap it with nums[i] and move both i and k.
 * If nums[k] is 1, move k forward.
 * If nums[k] is 2, swap it with nums[j] and move j backward.
 * We do not move k after placing a 2 because the swapped element
 * from the right side still needs to be processed.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SortColors {

    public static void sortColors(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int k = 0;

        while (k <= j) {

            if (nums[k] == 1) {
                k++;

            } else if (nums[k] == 2) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                j--;

            } else {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                i++;
                k++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
