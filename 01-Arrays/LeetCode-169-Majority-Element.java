/*
 * LeetCode #169 - Majority Element
 *
 * Approach:
 * Boyer-Moore Voting Algorithm
 *
 * We maintain a candidate and a count.
 * If count becomes 0, the current number becomes the new candidate.
 * If the current number matches the candidate, increase count.
 * Otherwise, decrease count.
 *
 * Since the problem guarantees that a majority element exists,
 * the final candidate is the majority element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}
