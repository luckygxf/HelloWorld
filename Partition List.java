public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        
        ListNode front = head;
        ListNode behind = headNode;			//˫ָ��
        
        while(front != null){				//�ҳ���һ�����ڵ���x��λ�ú�ǰһ��λ��
        	if(front.val >= x)
        		break;
        	front = front.next;
        	behind = behind.next;
        }//while
        if(front == null)
        	return head;					//���ԭ�б���Ϲ涨ֱ�ӷ���ͷ���
        while(front != null &&front.next != null){			//������xС�Ĳ��뵽behind���棬ͬʱɾ������Ľڵ�
        	if(front.next.val < x){
        		ListNode temp = new ListNode(front.next.val);
        		temp.next = behind.next;
        		behind.next = temp;
        		behind = temp;
        		front.next = front.next.next;				//ɾ���ڵ�
        		continue;
        	}//if
        	front = front.next;
        }//while
        return headNode.next;
    }
}