public class ValidPalindrome {

    /*
     * LeetCode #125 - Valid Palindrome
     *
     * Approach:
     * Use two pointers, one starting from the left
     * and the other starting from the right.
     *
     * Ignore non-alphanumeric characters and compare
     * characters without considering their case.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric characters from left
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters from right
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // Compare characters ignoring case
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
