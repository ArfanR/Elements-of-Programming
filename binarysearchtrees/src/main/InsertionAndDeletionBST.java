public class InsertionAndDeletionBST {

    /*
    14.10
    */
	private BinaryTree<Integer> root = null;
	
    public InsertionAndDeletionBST(Integer data) {
    	root = new BinaryTree<Integer>(data);
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
    	// Find the node with key.
        BinaryTree<Integer> curr = root, parent = null;
        while (curr != null && Integer.compare(curr.data, key) != 0) {
        	parent = curr;
        	curr = Integer.compare(key, curr.data) < 0 ? curr.left : curr.right;
        }

        if (curr == null) { // There's no node with key in this tree.
        	return false;
        }

        BinaryTree<Integer> keyNode = curr;
        // no children
        if (keyNode.left == null && keyNode.right == null) {
        	keyNode = null;
        }
        // one left child
        else if (keyNode.right == null) {
        	if (parent.left == keyNode) {
    			parent.left = keyNode.left;
    		} 
    		else {
    			parent.right = keyNode.left;
    		}
        	keyNode.left = null;
        }
        // one right child
        else if (keyNode.left == null) {
        	if (parent.left == keyNode) {
        		parent.left = keyNode.right;
        	}
        	else {
        		parent.right = keyNode.right;
        	}
        	keyNode.right = null;
        }
        else {
        	// Find the minimum of the right subtree.
        	BinaryTree<Integer> rKeyNode = keyNode.right;
        	BinaryTree<Integer> rParent = keyNode;
        	while (rKeyNode.left != null) {
        		rParent = rKeyNode;
        		rKeyNode = rKeyNode.left;
        	}
        	keyNode.data = rKeyNode.data;
        	// Move links to erase the node.
        	if (rParent.left == rKeyNode) {
        		rParent.left = rKeyNode.right;
        	} 
        	else { // rParent.left != rKeyNode.
        		rParent.right = rKeyNode.right;
        	}
        	rKeyNode.right = null;
        }
        return true; 
    }
    
}