/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;

        while (start.next != null && start.next.next != null) {
            ListNode num1 = start.next;
            ListNode num2 = num1.next;

            num1.next = num2.next;
            num2.next = num1;
            start.next = num2;

            start = num1;

        }
        return dummy.next;
    }

}
