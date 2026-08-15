/*
 * LeetCode #217 - Contains Duplicate
 *
 * Approach:
 * HashSet
 *
 * We use a HashSet to store the numbers that we have already seen.
 * For every number, we first check whether it already exists in the set.
 * If it exists, a duplicate has been found.
 * Otherwise, add the number to the set and continue.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}
