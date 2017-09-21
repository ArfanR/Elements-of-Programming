public class IsBST {

    /*
    14.1
    */

    public static boolean isBST(BinaryTree<Integer> tree) {
    	 return areKeysInRange(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean areKeysInRange(BinaryTree<Integer> tree, Integer lower, Integer upper) {
    	if (tree == null) {
    		return true;
    	} 
    	else if (Integer.compare(tree.data, lower) < 0 || Integer.compare(tree.data, upper) > 0) {
    		return false;
    	}

    	return areKeysInRange(tree.left, lower, tree.data) && areKeysInRange(tree.right, tree.data, upper);
    }
    
}