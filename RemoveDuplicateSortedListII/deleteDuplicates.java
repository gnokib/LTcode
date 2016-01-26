class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
	val = x;
	next = null;
    }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
	HashSet<Integer> rec = new HashSet<>();
	ListNode dummy = new ListNode(0);
	dummy.next = head;
	ListNode prev = dummy;
	ListNode curr = head;
	while (curr != null) {
	    if (!rec.contains(curr.val)) {
		rec.add(curr.val);
		prev.next = curr;
		if (curr.next != null && curr.val != curr.next.val) {
		    prev = prev.next;
		}
	    } else {
		prev.next = curr.next; 
	    }
	    curr = curr.next;
	}
	return dummy.next;
    }
}
