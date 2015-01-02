public class Solution {
    List<TreeNode> ans = new ArrayList<TreeNode>();
    public List<TreeNode> generateTrees(int n) {		
		return getTrees(1, n);        
    }
    private List<TreeNode> getTrees(int start, int end){  
    	
    	if(start > end)
    	{
    		ans.add(null);
    		return ans;
    	}
    	else{
    		for(int i = start; i <= end; i++){
    			List<TreeNode> sub_left = getTrees(start, i - 1);
    			List<TreeNode> sub_right = getTrees(i + 1, end);
    			for(TreeNode element_right : sub_right){
    				for(TreeNode element_left : sub_left){
    					TreeNode root = new TreeNode(i);
    					root.left = element_left;
    					root.right = element_right;
    					ans.add(root);
    				}
    			}
    		}
    	}
    	return ans;
    }
}