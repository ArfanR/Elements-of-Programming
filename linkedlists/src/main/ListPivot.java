public class ListPivot {

    /*
    7.12
    */

    public static ListNode<Integer> pivot(ListNode<Integer> list, int x) {
    	ListNode<Integer> lessHead = new ListNode<>(0, null);
        ListNode<Integer> equalHead = new ListNode<>(0, null);
        ListNode<Integer> greaterHead = new ListNode<>(0, null);
        ListNode<Integer> lessIter = lessHead;
        ListNode<Integer> equalIter = equalHead;
        ListNode<Integer> greaterIter = greaterHead;
        // Populates the three lists.
        ListNode<Integer> iter = list;
        while (iter != null) {
        	if (iter.data < x) {
        		lessIter.next = iter;
        		lessIter = iter;
        	} 
        	else if (iter.data == x) {
        		equalIter.next = iter;
        		equalIter = iter;
        	} 
        	else { // iter.data > x.
        		greaterIter.next = iter;
        		greaterIter = iter;
        	}
        	iter = iter.next;
        }
        // Combines the three lists.
        greaterIter.next = null;
        equalIter.next = greaterHead.next;
        lessIter.next = equalHead.next;
        return lessHead.next;
    }

}