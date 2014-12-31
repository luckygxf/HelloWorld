public class BSTIterator {
	private Queue<Integer> queueOfInOrder = new LinkedList<Integer>();			//������������õ��Ķ���
    public BSTIterator(TreeNode root) {
        InOrder(root);															//���������,�õ��������������
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(queueOfInOrder.isEmpty())
        	return false;														//����Ϊ�գ�˵���Ѿ����һ��Ԫ��
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        Integer headOfQueue = queueOfInOrder.poll();
        
        return headOfQueue;
    }
    
    /**
     * ���������
     */
    private void InOrder(TreeNode root){
    	if(null != root){
    		InOrder(root.left);
    		queueOfInOrder.add(root.val);
    		InOrder(root.right);
    	}
    }
}