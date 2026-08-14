/*
 * LeetCode #9 - Palindrome Number
 *
 * Approach:
 * Reverse Half of the Number
 *
 * We reverse only the second half of the number and compare it
 * with the first half.
 *
 * Negative numbers are not palindromes.
 * Numbers ending in 0 cannot be palindromes unless the number is 0.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {

        int x = 121;

        System.out.println(isPalindrome(x));
    }
}
