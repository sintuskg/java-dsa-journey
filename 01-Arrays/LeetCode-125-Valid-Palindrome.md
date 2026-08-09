# LeetCode 125 — Valid Palindrome

## Problem

Given a string `s`, determine whether it is a palindrome, considering only alphanumeric characters and ignoring case.

## Approach — Two Pointers

Use two pointers:

- `i` starts from the beginning.
- `j` starts from the end.
- Skip characters that are not letters or digits.
- Compare both characters after converting them to lowercase.
- If they are different, return `false`.
- Move both pointers toward the center.

## Java Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
```

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## Key Learning

This problem demonstrates the **Two Pointer technique** for processing a string efficiently without creating an extra cleaned string.
