import java.util.*;

public class ReconstructBinaryTreeWithMarkers {

    /*
    9.13
    */
	private static Integer subtreeIdx;

	public static BinaryTree<Integer> reconstructPreorder(List<Integer> preorder) {
		subtreeIdx = 0;
		return reconstructPreorderSubtree(preorder);
	}

	// Reconstructs the subtree that is rooted at subtreeIdx.
	private static BinaryTree<Integer> reconstructPreorderSubtree(List<Integer> preorder) {
		Integer subtreeKey = preorder.get(subtreeIdx);
		++subtreeIdx;
		if (subtreeKey == null) {
			return null;
		}
		// Note that reconstructPreorderSubtree updates subtreeIdx. So the order of
		// following two calls are critical.
		BinaryTree<Integer> leftSubtree = reconstructPreorderSubtree(preorder);
		BinaryTree<Integer> rightSubtree = reconstructPreorderSubtree(preorder);
		return new BinaryTree<>(subtreeKey, leftSubtree, rightSubtree);
	}
    
}

