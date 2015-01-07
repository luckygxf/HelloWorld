public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        
        ListNode front = head;
        ListNode behind = headNode;			//双指针
        
        while(front != null){				//找出第一个大于等于x的位置和前一个位置
        	if(front.val >= x)
        		break;
        	front = front.next;
        	behind = behind.next;
        }//while
        if(front == null)
        	return head;					//如果原列表符合规定直接返回头结点
        while(front != null &&front.next != null){			//遇到比x小的插入到behind后面，同时删除后面的节点
        	if(front.next.val < x){
        		ListNode temp = new ListNode(front.next.val);
        		temp.next = behind.next;
        		behind.next = temp;
        		behind = temp;
        		front.next = front.next.next;				//删除节点
        		continue;
        	}//if
        	front = front.next;
        }//while
        return headNode.next;
    }
}