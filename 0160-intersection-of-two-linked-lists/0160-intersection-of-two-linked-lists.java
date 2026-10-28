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
        ListNode P= headA;
        ListNode Q = headB;
        while(P!=Q){
           
    if (P == null) {
        P= headB;
    } else {
        P= P.next;
    }
    if (Q == null) {
        Q= headA;
    } else {
        Q = Q.next;
    }
}

return P;
}
}