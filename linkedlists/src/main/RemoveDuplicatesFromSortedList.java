public class RemoveDuplicatesFromSortedList {

    /*
    7.8
    */

    public static void removeDuplicates(ListNode<Integer> list) {
    	ListNode<Integer> dummy = list;
    	ListNode<Integer> temp = null;
    	
    	while (dummy.next != null) {
    		if (dummy.data == dummy.next.data) {
    			temp = dummy.next.next;
    			dummy.next = null;
    			dummy.next = temp;
    		}
    		else {
    			dummy = dummy.next;
    		}
    	}
    }

}