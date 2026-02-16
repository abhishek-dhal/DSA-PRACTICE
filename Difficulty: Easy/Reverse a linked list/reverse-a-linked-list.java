/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        
        Node prev = null;
        
        Node curr = head;
        
        Node after = null;
        
        while(curr != null){
            
            after = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            
            curr = after;
            
        }
        
        return prev;
        
    }
}