public class DeleteNode {
	
	/*
    7.6
    */
	
	public static void deleteNode(ListNode<Integer> node) {
		node.data = node.next.data;
		node.next = node.next.next;
	}
}