/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public void iOrder(Node node,ArrayList<Integer> ans){
        
        if(node == null) return;
        
        
        iOrder(node.left,ans);
        
        ans.add(node.data);
        
        iOrder(node.right,ans);
    }
    public ArrayList<Integer> inOrder(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        iOrder(root,ans);
        
        return ans;
        
    }
}