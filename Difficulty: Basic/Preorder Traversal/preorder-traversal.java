/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    public void pOrder(Node node,ArrayList<Integer> ans){
        
         if(node == null) return;
        
        ans.add(node.data);
        pOrder(node.left,ans);
        pOrder(node.right,ans);
        
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        pOrder(root,ans);
        
        
        return ans;
        
       
    }
}