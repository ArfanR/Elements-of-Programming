public class IsSymmetric {

    /*
    9.2
    */
	private static boolean checkSymmetric(BinaryTree<Integer> subtree0, BinaryTree<Integer> subtree1) {
		if (subtree0 == null && subtree1 == null) {
			return true;
	    } 
		else if (subtree0 != null && subtree1 != null) {
			return subtree0.data == subtree1.data
					&& checkSymmetric(subtree0.left, subtree1.right) 
					&& checkSymmetric(subtree0.right, subtree1.left);
	    }
	    // One subtree is empty, and the other is not.
	    return false;
	}
	
    public static boolean isSymmetric(BinaryTree<Integer> tree) {
    	return tree == null || checkSymmetric(tree.left, tree.right);
    }

}