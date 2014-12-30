public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();			//保存最后的结果
        if(null == root)
        	return result;
        boolean needReverse = false;												//是否要对列表中的内容进行逆序
        Queue<TreeNode> queue = new LinkedList<TreeNode>();						//BFS要使用到的队列
        queue.add(root);														//根节点入队
        while(!queue.isEmpty()){												//队列不为空
        	List<Integer> oneLevel = new ArrayList<Integer>();					//保存在同一层及节点的值
        	Queue<TreeNode> temp = new LinkedList<TreeNode>();					//存放下一层的节点
        	while(!queue.isEmpty()){
        		TreeNode headOfQueue = queue.remove();							//对头元素出队
        		oneLevel.add(headOfQueue.val);
        		if(headOfQueue.left != null)
        			temp.add(headOfQueue.left);									//左子树不为空，入队
        		if(headOfQueue.right != null)
        			temp.add(headOfQueue.right);								//右子树不为空，入队
        	}//while
        	if(needReverse)
        		reverseList(oneLevel);
        	result.add(oneLevel);
        	needReverse = !needReverse;
        	queue = temp;
        }
        return result;
    }
    
    /**
     * list列表中内容逆序
     * @param list
     */
    private void reverseList(List<Integer> list){
    	for(int i = 0, j = list.size() - 1; i < j; i++, j--){
    		int temp = list.get(i);
    		list.set(i, list.get(j));
    		list.set(j, temp);
    	}
    }
}