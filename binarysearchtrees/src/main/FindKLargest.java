import java.util.*;

public class FindKLargest {

    /*
    14.3
    */

    public static List<Integer> findLargest(BinaryTree<Integer> tree, int k) {
    	List<Integer> kLargestElements = new ArrayList<>();
    	findKLargestInBSTHelper(tree, k, kLargestElements);
    	return kLargestElements;
    }
    
    private static void findKLargestInBSTHelper(BinaryTree<Integer> tree, int k, List<Integer> kLargestElements) {
    	// perform reverse inorder traversal
    	if (tree != null && kLargestElements.size() < k) {
    		findKLargestInBSTHelper(tree.right, k, kLargestElements);
    		if (kLargestElements.size() < k) {
    			kLargestElements.add(tree.data);
    			findKLargestInBSTHelper(tree.left, k, kLargestElements);
    		}
    	}
    }
}