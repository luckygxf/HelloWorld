public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();			//�������Ľ��
        if(null == root)
        	return result;
        boolean needReverse = false;												//�Ƿ�Ҫ���б��е����ݽ�������
        Queue<TreeNode> queue = new LinkedList<TreeNode>();						//BFSҪʹ�õ��Ķ���
        queue.add(root);														//���ڵ����
        while(!queue.isEmpty()){												//���в�Ϊ��
        	List<Integer> oneLevel = new ArrayList<Integer>();					//������ͬһ�㼰�ڵ��ֵ
        	Queue<TreeNode> temp = new LinkedList<TreeNode>();					//�����һ��Ľڵ�
        	while(!queue.isEmpty()){
        		TreeNode headOfQueue = queue.remove();							//��ͷԪ�س���
        		oneLevel.add(headOfQueue.val);
        		if(headOfQueue.left != null)
        			temp.add(headOfQueue.left);									//��������Ϊ�գ����
        		if(headOfQueue.right != null)
        			temp.add(headOfQueue.right);								//��������Ϊ�գ����
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
     * list�б�����������
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