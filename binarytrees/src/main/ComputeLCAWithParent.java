public class ComputeLCAWithParent {

    /*
    9.4
    */
	
	private static int getDepth(BinaryTreeParent<Integer> node) {
		int depth = 0;
		while (node.parent != null) {
			++depth;
			node = node.parent;
		}
	}
	
    public static BinaryTreeParent<Integer> LCA(BinaryTreeParent<Integer> node0, BinaryTreeParent<Integer> node1) {
    	int depth0 = getDepth(node0), depth1 = getDepth(node1);
    	// Makes node0 as the deeper node in order to simplify the code.
    	if (depth1 > depth0) {
    		BinaryTree<Integer> temp = node0;
    		node0 = node1;
    		node1 = temp;
    	}
    	// Ascends from the deeper node.
    	int depthDiff = Math.abs(depth0 - depth1);
    	while (depthDiff-- > 0) {
    		node0 = node0.parent;
    	}

    	// Now ascends both nodes until we reach the LCA.
    	while (node0 != node1) {
    		node0 = node0.parent;
    		node1 = node1.parent;
    	}
    	return node0;
    }
}