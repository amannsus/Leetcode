/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lena = 0;
        int lenb = 0;
        while (tempA != null) {
            lena++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenb++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;
        
        while (lena > lenb) {
          tempA = tempA.next;
          lena--;
        }

        while(lena < lenb){
            tempB = tempB.next;
            lenb--;
        }
            
     while(tempA!=tempB){
        tempA = tempA.next;
        tempB = tempB.next;
     }

      return tempB;
    }

}