# LeetCode 88 — Merge Sorted Array

## Problem

Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

`nums1` has enough extra space at the end to hold all elements of `nums2`.

## Approach — Three Pointers

Use three pointers from the **end** of the arrays:

- `i` → last valid element of `nums1`
- `j` → last element of `nums2`
- `k` → last position of `nums1`

Compare `nums1[i]` and `nums2[j]` and place the larger element at `nums1[k]`.

Working from the end prevents overwriting elements in `nums1` that still need to be compared.

After the main loop, if elements remain in `nums2`, copy them into `nums1`.

## Java Solution

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
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

        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}
```

## Example

**Input:**

`nums1 = [1,2,3,0,0,0], m = 3`

`nums2 = [2,5,6], n = 3`

**Output:**

`[1,2,2,3,5,6]`

## Complexity

- **Time Complexity:** `O(m + n)`
- **Space Complexity:** `O(1)`

## Key Learning

When merging sorted arrays in-place, processing from the **back** allows us to use the empty space in `nums1` without overwriting useful elements.
