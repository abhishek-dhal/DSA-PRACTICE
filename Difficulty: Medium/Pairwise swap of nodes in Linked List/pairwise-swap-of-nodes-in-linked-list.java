/*class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    } */
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        
        if(head == null || head.next == null) return head;
        
        Node curr = head;
        
        while(curr != null && curr.next != null){
            
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            
            
            curr = curr.next.next;
        }
        
        return head;
    }
}