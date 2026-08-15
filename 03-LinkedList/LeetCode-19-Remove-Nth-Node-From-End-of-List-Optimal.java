/*
 * LeetCode #19 - Remove Nth Node From End of List
 *
 * Approach:
 * One Pass + Two Pointer + Dummy Node
 *
 * We use two pointers with a gap of n nodes between them.
 * First, move the fast pointer n steps forward.
 * Then move both pointers together until fast reaches the end.
 *
 * At that point, slow is positioned just before the node
 * that needs to be removed.
 *
 * The dummy node makes removing the head node safe and simple.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveNthNodeFromEndOfListOptimal {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

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

        ListNode left = head;
        int jump = 0;

        while (jump < n && left != null) {
            left = left.next;
            jump++;
        }

        ListNode prev = dummy;
        ListNode curr = left;

        while (curr != null) {
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = prev.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        head = removeNthFromEnd(head, 2);

        printList(head);
    }
}
