import java.util.*;

public class PreOrderIterative {

    /*
    9.8
    */

    public static List<Integer> BSTPreOrder(BinaryTree<Integer> tree) {
    	Deque<BinaryTree<Integer>> path = new LinkedList<>();
        path.addFirst(tree);
        List<Integer> result = new ArrayList<>();
        
        while (!path.isEmpty()) {
        	BinaryTree<Integer> curr = path.removeFirst();
        	if (curr != null) {
        		result.add(curr.data);
        		path.addFirst(curr.right);
        		path.addFirst(curr.left);
        	}
        }
        return result;
    }
}