
//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Problem_543 {
//    Diameter of Binary Tree
    class Solution {
        int maxDiameter = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return maxDiameter;
        }
        int depth(TreeNode root){
            if(root==null){
                return 0;
            }
            int ld = depth(root.left);
            int rd = depth(root.right);
            maxDiameter = Math.max(maxDiameter,ld+rd);
            return Math.max(ld,rd)+1;
        }
    }
}
