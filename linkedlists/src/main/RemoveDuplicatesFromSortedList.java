 public class RemoveDuplicatesFromSortedList {

    /*
    7.8
    */

    public static ListNode<Integer> removeDuplicates(ListNode<Integer> list) {
    	ListNode<Integer> dummyHead = new ListNode<Intger>(0, list);
    	ListNode<Integer> iter = dummyHead.next;
   	
    	while (iter != null) {
    		ListNode<Integer> nextDistinct = iter.next;
    		while (nextDistinct != null && nextDistinct.data != iter.data) {
    			nextDistinct = nextDistinct.next;
    		}
    		iter.next = nextDistinct;
    		iter = nextDistinct;
    	}
    	
    	return dummyHead.next;
    }

}