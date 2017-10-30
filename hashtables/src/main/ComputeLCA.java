import java.util.*;

public class ComputeLCA {

    /*
    12.4
    */

    public static BinaryTreeParent<Integer> LCA(BinaryTreeParent<Integer> node0, BinaryTreeParent<Integer> node1) {
    	Set<BinaryTreeParent<Integer>> hash = new HashSet<>();
        while (node0 != null || node1 != null) {
          // Ascend tree in tandem from these two nodes.
        	if (node0 != null) {
        		if (!hash.add(node0)) {
        			return node0;
        		}
        		node0 = node0.parent;
        	}
        	if (node1 != null) {
        		if (!hash.add(node1)) {
        			return node1;
        		}
        		node1 = node1.parent;
        	}
        }
        throw new IllegalArgumentException("node0 and node1 are not in the same tree");
    }
}