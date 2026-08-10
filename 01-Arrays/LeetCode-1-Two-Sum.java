/*
 * LeetCode #1 - Two Sum
 *
 * Approach:
 * HashMap
 *
 * We use a HashMap to store each number and its index.
 * For every element, we calculate the value needed to reach
 * the target and check whether that value already exists in the map.
 *
 * If it exists, we have found the required pair of indices.
 * Otherwise, store the current number and its index in the map.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int lookingFor = target - nums[i];

            if (map.containsKey(lookingFor)) {
                return new int[] {
                        i,
                        map.get(lookingFor)
                };
            }

            map.put(nums[i], i);
        }

        return new int[] {
                -1, -1
        };
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
