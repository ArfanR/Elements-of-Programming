public class ReverseSingleSublist {

    /*
    7.2
    */

    public static ListNode<Integer> reverseSublist(ListNode<Integer> input, int start, int finish) {
    	ListNode<Integer> dummyHead = new ListNode<>(0, input);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 1;
        while (k++ < start) {
          sublistHead = sublistHead.next;
        }
        // Reverse sublist.
        ListNode<Integer> sublistIter = sublistHead.next;
        while (start++ < finish) {
          ListNode<Integer> temp = sublistIter.next;
          sublistIter.next = temp.next;
          temp.next = sublistHead.next;
          sublistHead.next = temp;
        }
        return dummyHead.next;
    }
    
    // Variant: reverse a linked list
 	public static ListNode<Integer> reverse(ListNode<Integer> head) {
 		ListNode<Integer> prev = null;
 		ListNode<Integer> current = head;
 		ListNode<Integer> next;
 		// use prev as dummy node
 		while (current != null) {
 			next = current.getNext();
 			current.setNext(prev);
 			prev = current;
 			current = next;
 		}
 		return prev;
 	}
    
}