public class EvenOddMerge {

    /*
    7.10
    */

    public static ListNode<Integer> merge(ListNode<Integer> head) {
        if(head == null) {
            return head;
        }
        ListNode<Integer> result = head;
        ListNode<Integer> p1 = head;
        ListNode<Integer> p2 = head.next;
        ListNode<Integer> connectNode = head.next;
     
        while (p1 != null && p2 != null) {
        	if (p2.next == null) break;
        	
        	p1.next = p2.next;
        	p1 = p1.next;
     
        	p2.next = p1.next;	
        	p2 = p2.next;
        }
        p1.next = connectNode;
        return result;
    }
}