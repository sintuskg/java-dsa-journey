/*
 * LeetCode #19 - Remove Nth Node From End of List
 *
 * Approach:
 * Two Pass + Dummy Node
 *
 * First, calculate the length of the linked list.
 * Then find the node before the node that needs to be removed.
 *
 * A dummy node is used before the head so removing the head
 * node is handled safely.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveNthNodeFromEndOfList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int len = 0;
        ListNode l = head;

        while (l != null) {
            len++;
            l = l.next;
        }

        int d = len - n + 1;

        ListNode prev = dummy;
        ListNode curr = head;
        int i = 0;

        while (i < d - 1) {
            prev = prev.next;
            curr = curr.next;
            i++;
        }

        prev.next = prev.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        head = removeNthFromEnd(head, 2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
