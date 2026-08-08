/*
 * LeetCode #344 - Reverse String
 *
 * Approach:
 * Two Pointer
 *
 * We use two pointers:
 * left  -> starts from the beginning
 * right -> starts from the end
 *
 * We swap the characters at both pointers
 * and move them toward the center.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ReverseString {

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] input = {'h', 'e', 'l', 'l', 'o'};

        reverseString(input);

        System.out.println(input);
    }
}
