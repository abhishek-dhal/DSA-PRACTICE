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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode = new ListNode(-1);

        ListNode curr = dummyNode;

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        while(p1 != null || p2 != null || carry != 0){

            int val1 = 0;
            int val2 = 0;

            if(p1 != null) val1 = p1.val;

            if(p2 != null) val2 = p2.val;

            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);

            curr.next = newNode;

            curr = curr.next;

            if(p1 != null) p1 = p1.next;
            if(p2 != null) p2 = p2.next;
        }

        return dummyNode.next;
    }
}