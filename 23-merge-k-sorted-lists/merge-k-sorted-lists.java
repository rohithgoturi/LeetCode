/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] arr) {
       if (arr.length == 0)
			return null;
		
		ArrayList<ListNode> list = new ArrayList<>();
		for (ListNode i : arr)
			list.add(i);
		
		while (list.size()>1) {
			ListNode a = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			ListNode b = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			ListNode c = mergeList(a, b);
			list.add(c);
		}
		
		return list.get(0); 
    }
	
	ListNode mergeList(ListNode head1, ListNode head2) {
		ListNode first = head1;
		ListNode second = head2;
		
		ListNode dummy = new ListNode(-1);
		ListNode k = dummy;
		
		while (first != null && second != null) {
			if (first.val > second.val) {
				k.next = second;
				second = second.next;
			} else {
				k.next = first;
				first = first.next;
			}
			
			k = k.next;
		}
		
		if (first != null)
			k.next = first;
		else
			k.next = second;
		
		return dummy.next;
	}
}