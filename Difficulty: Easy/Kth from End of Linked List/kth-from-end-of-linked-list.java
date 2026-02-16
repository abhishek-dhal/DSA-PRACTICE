/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        int cnt = 0;
        
        Node ptr = head;
        
        while(ptr != null){
            cnt++;
            ptr = ptr.next;
        }
        
        if(k > cnt) return -1;
        
        int req = cnt - k;
        
        Node p = head;
        
        int c = 0;
        
        int ans = 0;
        
        while( p != null && c != req ){
            
            c++;
            
            p = p.next;
        }
        
        return p.data;
    }
}