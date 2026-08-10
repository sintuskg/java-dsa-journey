/*
 * LeetCode #88 - Merge Sorted Array
 *
 * Approach:
 * Three Pointer
 *
 * We use three pointers:
 * i -> starts from the last valid element of nums1
 * j -> starts from the last element of nums2
 * k -> starts from the last position of nums1
 *
 * We compare elements from the end and place the larger
 * element at position k. Working from the end prevents
 * overwriting elements that still need to be compared.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
