public class ComputeLCA {

    /*
    14.4
    */

    public static BinaryTree<Integer> findLCA(BinaryTree<Integer> tree, BinaryTree<Integer> s, BinaryTree<Integer> b) {
    	BinaryTree<Integer> p = tree;
    	while (p.data < s.data || p.data > b.data) {
    		while (p.data < s.data) {
    			p = p.right;
    		}
    		while (p.data > b.data) {
    			p = p.left;
    		}
    	}
    	return p;
    }
}