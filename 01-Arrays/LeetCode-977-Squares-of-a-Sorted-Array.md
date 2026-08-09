# LeetCode 977 — Squares of a Sorted Array

## Problem

Given an integer array `nums` sorted in non-decreasing order, return an array of the squares of each number, also sorted in non-decreasing order.

## Approach — Two Pointers

Because the input is already sorted, the largest square must come from either the leftmost negative value or the rightmost positive value.

We use two pointers:

- `i` starts at the beginning.
- `j` starts at the end.
- `k` fills the result array from right to left.

At every step, compare `Math.abs(nums[i])` and `Math.abs(nums[j])`. Put the larger square at `res[k]`, then move the corresponding pointer.

This avoids sorting the squared values separately.

## Java Solution

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return res;
    }
}
```

## Example

Input:

`[-4, -1, 0, 3, 10]`

Output:

`[0, 1, 9, 16, 100]`

## Complexity

- **Time:** `O(n)`
- **Space:** `O(n)` for the result array

## Key Learning

When an array is sorted but contains negative values, squaring can destroy the sorted order. Comparing absolute values from both ends allows us to build the final sorted result in linear time.

**Pattern:** Two Pointers → Fill Result from Right to Left
