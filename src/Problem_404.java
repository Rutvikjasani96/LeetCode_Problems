public class Problem_404 {
//    Sum of Leaf Leaves
    public int sumOfLeftLeaves(TreeNode root) {
        return sumofLeftLeaves(root,false);
    }
    int sumofLeftLeaves(TreeNode root,boolean isLeft){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return isLeft ? root.val : 0;
        }
        int leftSum = sumofLeftLeaves(root.left,true);
        int rightSum = sumofLeftLeaves(root.right,false);
        return leftSum+rightSum;
    }
}
