//GFG : Height of binary tree
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
         if(node==null)
        return 0;
        int left=1+height(node.left);
        int right=1+height(node.right);
        return Math.max(left,right);// code here 
    }
}
