public class InsertionAndDeletionBST extends BinaryTree<Integer> {

    /*
    14.10
    */

    public InsertionAndDeletionBST(Integer data) {
        super(data);
    }

    public boolean insert(Integer key) {
    	if (root == null) {
    		root = new BinaryTree<Integer>(key, null, null);
        } 
    	else {
    		BinaryTree<Integer> curr = root;
            BinaryTree<Integer> parent = curr;
            while (curr != null) {
            	parent = curr;
            	int cmp = Integer.compare(key, curr.data);
            	if (cmp == 0) {
            		return false; // key already present, no duplicates to be added.
            	} 
            	else if (cmp < 0) {
            		curr = curr.left;
            	} 
            	else { // cmp > 0.
            		curr = curr.right;
            	}
            }

            // Insert key according to key and parent.
            if (Integer.compare(key, parent.data) < 0) {
            	parent.left = new BinaryTree<Integer>(key, null, null);
            } 
            else {
            	parent.right = new BinaryTree<Integer>(key, null, null);
            }
    	}
    	return true;
    }

    public boolean delete(Integer key) {
        return false;
    }
}