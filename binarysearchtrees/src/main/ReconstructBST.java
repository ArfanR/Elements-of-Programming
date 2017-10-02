import java.util.*;

public class ReconstructBST {

    /*
    14.5
    */
	private static Integer rootIdx;
	
    public static BinaryTree<Integer> reconstruct(List<Integer> preorder) {
    	rootIdx = 0;
        return rebuildBSFromPreorderOnValueRange(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    // Builds a BST on the subtree rooted at rootIdx from preorder on keys
    // in (lowerBound, upperBound).
    private static BinaryTree<Integer> rebuildBSFromPreorderOnValueRange(List<Integer> preorder, Integer lowerBound, Integer upperBound) {
    	if (rootIdx == preorder.size()) {
    		return null;
    	}
    	Integer root = preorder.get(rootIdx);
    	if (root < lowerBound || root > upperBound) {
    		return null;
    	}
    	++rootIdx;
    	// Note that rebuildBSFromPreorderOnValueRange updates rootIdx. So the order
    	// of following two calls are critical.
    	BinaryTree<Integer> leftSubtree = rebuildBSFromPreorderOnValueRange(preorder, lowerBound, root);
    	BinaryTree<Integer> rightSubtree = rebuildBSFromPreorderOnValueRange(preorder, root, upperBound);
    	return new BinaryTree<>(root, leftSubtree, rightSubtree);
    }
    
}