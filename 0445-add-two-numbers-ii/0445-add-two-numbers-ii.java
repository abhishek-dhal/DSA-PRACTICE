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
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            ListNode after = curr.next;
            curr.next = prev;

            //move curr and prev

            prev = curr;
            curr = after;
        }

        return prev;


    }

    public ListNode addTwoNo(ListNode head1,ListNode head2){

        ListNode dummyNode = new ListNode(-1);

        ListNode curr = dummyNode;

        ListNode p1 = head1;
        ListNode p2 = head2;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode newHead1 = reverseList(l1);

        ListNode newHead2 = reverseList(l2);

        ListNode finalHead = addTwoNo(newHead1,newHead2);

        return reverseList(finalHead);


    }
}