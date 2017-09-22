import java.util.List;

public class MinimalHeightBST {

    /*
    14.9
    */

    public static BinaryTree<Integer> build(List<Integer> A) {
    	return buildMinHeightBST(A, 0, A.size()-1);
    }
    
    private static BinaryTree<Integer> buildMinHeightBST(List<Integer> A, int start, int end) {
    	if (start == end) {
    		return new BinaryTree<Integer>(A.get(start));
    	}
    	else {
    		int mid = (start+end)/2;
    		BinaryTree<Integer> tree = new BinaryTree<Integer>(A.get(mid));
    		tree.left = buildMinHeightBST(A, start, mid-1);
    		tree.right = buildMinHeightBST(A, mid+1, end);
    		return tree;
    	}
    }

}