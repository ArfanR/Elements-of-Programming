public class Palindromic {

    /*
    7.11
    */

    public static boolean isPalindromic(ListNode<Integer> L) {
    	// Finds the second half of L.
    	ListNode<Integer> slow = L, fast = L;
    	while (fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}

        // Compare the first half and the reversed second half lists.
        ListNode<Integer> firstHalfIter = L;
        ListNode<Integer> secondHalfIter = reverseLinkedList(slow);
        while (secondHalfIter != null && firstHalfIter != null) {
        	if (secondHalfIter.data != firstHalfIter.data) {
        		return false;
        	}
        	secondHalfIter = secondHalfIter.next;
        	firstHalfIter = firstHalfIter.next;
        }
        return true;
    }

    public static ListNode<Integer> reverseLinkedList(ListNode<Integer> head) {
 		ListNode<Integer> prev = null;
 		ListNode<Integer> current = head;
 		ListNode<Integer> next;
 		// use prev as dummy node
 		while (current != null) {
 			next = current.next;
 			current.next = prev;
 			prev = current;
 			current = next;
 		}
 		return prev;
 	}
}