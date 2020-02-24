public class EvenOddMerge {

    /*
    7.10
    */

    public static ListNode<Integer> merge(ListNode<Integer> L) {
        if (L == null) {
            return L;
        }
        
        ListNode<Integer> evenDummyHead = new ListNode<>(0, null);
        ListNode<Integer> oddDummyHead = new ListNode<>(0, null);
        List<ListNode<Integer>> tails = Arrays.asList(evenDummyHead, oddDummyHead);
        int turn = 0;
        for (ListNode<Integer> iter = L; iter != null; iter = iter.next) {
        	tails.get(turn).next = iter;
        	tails.set(turn, tails.get(turn).next);
        	turn ^= 1;
        }
        tails.get(1).next = null;
        tails.get(0).next = oddDummyHead.next;
        return evenDummyHead.next;
    }
}