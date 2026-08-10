/*
 * LeetCode #680 - Valid Palindrome II
 *
 * Approach:
 * Two Pointer + Helper Method
 *
 * We use two pointers:
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * When a mismatch is found, we can delete at most one character.
 * Therefore, we check both possibilities:
 * 1. Skip the left character
 * 2. Skip the right character
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ValidPalindromeII {

    public static boolean palindromeHelper(int left, int right, String s) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (leftChar != rightChar) {

                // Delete one element and check both possibilities
                return palindromeHelper(left + 1, right, s)
                        || palindromeHelper(left, right - 1, s);
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "abca";

        System.out.println(validPalindrome(input));
    }
}
