import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReconstructBinaryTreeTest {

    private BinaryTree<Integer> expected;
    private List<Integer> preorder;
    private List<Integer> inorder;

    @Test
    public void binaryTreeFromPreorderInorder1() throws Exception {
        expected = BinaryTreeUtil.getOddTree();
        preorder = Arrays.asList(0,1,2);
        inorder = Arrays.asList(2,1,0);

        test(expected, preorder, inorder);
    }

    @Test
    public void binaryTreeFromPreorderInorder2() throws Exception {
        expected = BinaryTreeUtil.getFullBST();
        preorder = Arrays.asList(0,1,2,3,4,5,6);
        inorder = Arrays.asList(2,1,3,0,5,4,6);

        test(expected, preorder, inorder);
    }


    private void test(BinaryTree<Integer> expected, List<Integer> preorder, List<Integer> inorder) {
        assertEquals(expected, ReconstructBinaryTree.binaryTreeFromPreorderInorder(preorder, inorder));
    }

}