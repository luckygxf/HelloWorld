public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {      
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        head = headNode;							//����һ��ͷ���
        
        ListNode toEnd = head;
        ListNode toInsert = head;
        
        for(int i = 1; i < m; i++){						//�ҵ������
        	toInsert = toInsert.next;
        	toEnd = toEnd.next;
        }//for
        if(m < n){										//��һ������ͷ�����뷨�����
        	toEnd = toEnd.next;
        	ListNode temp = new ListNode(toEnd.val);
        	toInsert.next = temp;
        }//if
        
        int count = n - m;
        while(count > 0){								//����ͷ�巨
        	toEnd = toEnd.next;
        	ListNode temp = new ListNode(toEnd.val);
        	temp.next = toInsert.next;
        	toInsert.next = temp;
        	count--;
        }//while
        
        if(m < n)
        {
        	while(toInsert.next != null)
        		toInsert = toInsert.next;
        	toInsert.next = toEnd.next;
        }
        
        head = head.next;
        return head;
    }    
}