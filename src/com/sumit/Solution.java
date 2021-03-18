package com.sumit;

public class Solution {
	
	
	public ListNode removeElements(ListNode head, int val) {
		
		while(head!=null && head.val ==val) 
		{
			head = head.next;
		}
		
		ListNode curr = head;
		
		while(curr != null && curr.next != null) 
		{
			if(curr.next!=null && curr.next.val==val) 
			{
				curr.next = curr.next.next;
			}
			else
			{
				curr = curr.next;
			}
		}
		
		return head;
	}

}

/*input = [1,2,6,3,4,5,6] , val=6
  output = [1,2,3,4,5]
          
  input = [7,7,7,7,7] , val=7
* output = [7]
*/
