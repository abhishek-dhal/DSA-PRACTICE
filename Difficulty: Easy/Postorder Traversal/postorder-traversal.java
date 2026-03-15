/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public void pOrder(Node node,ArrayList<Integer> ans){
        
        if(node == null) return;
        
        
        pOrder(node.left,ans);
        
        
        pOrder(node.right,ans);
        
        ans.add(node.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        pOrder(root,ans);
        
        return ans;
        
    }
}