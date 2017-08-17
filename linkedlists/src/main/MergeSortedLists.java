public class MergeSortedLists {

    /*
    7.1
    */
	
    public static ListNode<Integer> mergeLists(ListNode<Integer> list1, ListNode<Integer> list2) {
    	ListNode<Integer> dummy = new ListNode<>(0, null);
    	ListNode<Integer> current = dummy;
    	ListNode<Integer> l1 = list1;
    	ListNode<Integer> l2 = list2;
    	
    	while (l1 != null && l2 != null) {
    		if (l1.data <= l2.data) {
    			current.next = l1;
    			l1 = l1.next;
    		} 
    		else {
    			current.next = l2;
    			l2 = l2.next;
    		}
    		current = current.next;
    	}
    	
    	current.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}