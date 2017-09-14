public class IsHeightBalanced {

    /*
    9.1
    */

	private static class BalanceStatusWithHeight {
	    public boolean balanced;
	    public int height;

	    public BalanceStatusWithHeight(boolean balanced, int height) {
	      this.balanced = balanced;
	      this.height = height;
	    }
	}

	private static BalanceStatusWithHeight checkBalanced(BinaryTree<Integer> tree) {
	    if (tree == null) {
	      return new BalanceStatusWithHeight(true, -1); // Base case.
	    }

	    BalanceStatusWithHeight leftResult = checkBalanced(tree.left);
	    if (!leftResult.balanced) {
	      return leftResult; // Left subtree is not balanced.
	    }
	    BalanceStatusWithHeight rightResult = checkBalanced(tree.right);
	    if (!rightResult.balanced) {
	      return rightResult; // Right subtree is not balanced.
	    }

	    boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
	    int height = Math.max(leftResult.height, rightResult.height) + 1;
	    return new BalanceStatusWithHeight(isBalanced, height);
	}
	
    public static boolean isBalanced(BinaryTree<Integer> tree) {
    	return checkBalanced(tree).balanced;
    }
    
}