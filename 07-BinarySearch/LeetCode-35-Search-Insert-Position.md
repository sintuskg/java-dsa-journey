# LeetCode 35 — Search Insert Position

**Difficulty:** Easy  
**Topic:** Binary Search  
**Language:** Java

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If it is not found, return the index where it would be inserted in order.

## Approach

Use **Binary Search** because the array is sorted.

1. Set `left = 0` and `right = nums.length - 1`.
2. Find the middle index using `left + (right - left) / 2`.
3. If `nums[mid] == target`, return `mid`.
4. If `nums[mid] < target`, search the right half by moving `left` to `mid + 1`.
5. Otherwise, search the left half by moving `right` to `mid - 1`.
6. When the loop ends, `left` is exactly the position where the target should be inserted.

## Java Solution

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }
}
```

## Complexity

- **Time:** `O(log n)`
- **Space:** `O(1)`

## Key Learning

The important idea is that after binary search finishes, `left` points to the first position where the target can be inserted without breaking the sorted order.

### Example

```text
nums = [1, 3, 5, 6]
target = 2

Answer = 1
```

`2` should be inserted between `1` and `3`, so index `1` is returned.

## LeetCode

Problem #35 — Search Insert Position
