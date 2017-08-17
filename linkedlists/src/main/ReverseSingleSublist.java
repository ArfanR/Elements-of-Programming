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
    
}