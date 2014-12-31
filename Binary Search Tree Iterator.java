public class BSTIterator {
	private Queue<Integer> queueOfInOrder = new LinkedList<Integer>();			//保存中序遍历得到的队列
    public BSTIterator(TreeNode root) {
        InOrder(root);															//中序遍历树,得到中序遍历结点队列
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(queueOfInOrder.isEmpty())
        	return false;														//队列为空，说明已经最后一个元素
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        Integer headOfQueue = queueOfInOrder.poll();
        
        return headOfQueue;
    }
    
    /**
     * 中序遍历树
     */
    private void InOrder(TreeNode root){
    	if(null != root){
    		InOrder(root.left);
    		queueOfInOrder.add(root.val);
    		InOrder(root.right);
    	}
    }
}