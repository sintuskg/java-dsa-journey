/*
 * LeetCode #125 - Valid Palindrome
 *
 * Approach:
 * Two Pointer
 *
 * We use two pointers:
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * We skip non-alphanumeric characters and compare
 * characters after converting them to lowercase.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters from the right
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // Compare characters without considering case
            if (Character.toLowerCase(leftChar)
                    != Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(input));
    }
}
