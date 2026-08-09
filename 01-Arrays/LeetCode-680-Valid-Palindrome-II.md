# LeetCode 680 — Valid Palindrome II

## Problem

Given a string `s`, return `true` if the string can become a palindrome after deleting **at most one character**.

## Approach — Two Pointers + Helper

Use two pointers:

- `i` starts from the beginning.
- `j` starts from the end.
- Compare characters from both ends.
- If they match, move both pointers inward.
- If they do not match, we can delete at most one character, so check both possibilities:
  - Skip the left character: `i + 1, j`
  - Skip the right character: `i, j - 1`
- The helper method checks whether the remaining substring is a palindrome.

## Java Solution

```java
class Solution {
    public boolean palindromeHelper(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (left != right) {
                return palindromeHelper(i + 1, j, s)
                        || palindromeHelper(i, j - 1, s);
            } else {
                i++;
                j--;
            }
        }

        return true;
    }
}
```

## Example

**Input:** `"abca"`

At the first mismatch, either `b` or `c` can be deleted:

- Delete `b` → `aca` → palindrome
- Delete `c` → `aba` → palindrome

**Output:** `true`

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## Key Learning

This problem combines the **Two Pointer technique** with a small helper check. When the first mismatch occurs, only two deletion choices are possible, so both can be checked efficiently.
