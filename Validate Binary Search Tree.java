public class Solution {
    public boolean isValidBST(TreeNode root) {
       return isBST(root, ((long)Integer.MIN_VALUE) - 1, ((long)Integer.MAX_VALUE) + 1); 
    }
    private boolean isBST(TreeNode root, long leftVal,long rightVal){
    	if(root == null)
    		return true;
    	
    	return ((long)root.val) > leftVal && ((long)root.val) < rightVal && isBST(root.left, leftVal, ((long)root.val))
    			&& isBST(root.right, ((long)root.val), rightVal);
    }
}