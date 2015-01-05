public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {      
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        head = headNode;							//插入一个头结点
        
        ListNode toEnd = head;
        ListNode toInsert = head;
        
        for(int i = 1; i < m; i++){						//找到插入点
        	toInsert = toInsert.next;
        	toEnd = toEnd.next;
        }//for
        if(m < n){										//第一个采用头结点插入法插入的
        	toEnd = toEnd.next;
        	ListNode temp = new ListNode(toEnd.val);
        	toInsert.next = temp;
        }//if
        
        int count = n - m;
        while(count > 0){								//采用头插法
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