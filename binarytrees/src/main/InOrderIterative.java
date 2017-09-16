import java.util.Collections;
import java.util.List;

public class InorderIterative {

    /*
    9.7
    */

    public static List<Integer> BSTInOrder(BinaryTree<Integer> tree) {
    	Deque<BSTNode<Integer>> s = new LinkedList<>();
        BSTNode<Integer> curr = tree;
        List<Integer> result = new ArrayList<>();

        while (!s.isEmpty() || curr != null) {
        	if (curr != null) {
        		s.addFirst(curr);
        		// Going left.
        		curr = curr.left;
        	} 
        	else {
        		// Going up.
        		curr = s.removeFirst();
        		result.add(curr.data);
        		// Going right.
        		curr = curr.right;
        	}
        }
        return result;
    }
    
}